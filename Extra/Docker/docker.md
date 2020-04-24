---
title: Guía de Docker
author: Gabriel Rodríguez Flores
---

# Instalación

## Docker engine

### Ubuntu 14.04 LTS

- Actualizar repositorio e instalar

```bash
sudo apt-get update
sudo apt-get -y install docker.io
```

> Nota: Para nuevas versiones, realizar la [instalación oficial de Docker](), el repositorio no está actualizado.

- Comprobar la instalación

```bash
sudo docker run hello-world
```

## Docker compose

- Descargar y activar los permisos

```bash
sudo curl -L "https://github.com/docker/compose/releases/download/1.25.4/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
```

# Configuración

- **Evitar poner sudo en cada instrucción**

Habrá que añadir un grupo al que darle permisos:

```bash
sudo groupadd docker
sudo usermod -aG docker $USER
```

# Uso

## Ejemplos

### Servidor MySQL

#### Despliegue

- Podemos seguir el siguiente [tutorial](https://dev.to/lito/mysql-8-en-docker-de-manera-facil-y-para-toda-la-familia-3744)

- O las [instrucciones oficiales de MySQL para Docker](https://hub.docker.com/r/mysql/mysql-server/)

> Tambien es interesante esta [entrada](https://platzi.com/tutoriales/1432-docker/3268-como-crear-un-contenedor-con-docker-mysql-y-persistir-la-informacion/) para persistir los datos del contenedor.

En resumen, se trata de descargar la imagen

```bash
docker pull mysql/mysql-server
```

Y arrancarla con los parámetros correspondientes

- **-p** Puerto a exponer (3307)
- **-v** Volumen externo para los datos
- **--name** Nombre que le damos al contenedor
- **--restart**
- **-d** Imagen a usar 

```bash
sudo docker run \
    -p 3307:3306 \
    -v /mysql-8-data:/var/lib/mysql \
    --name mysql-8 \
    --restart always \
    -d mysql/mysql-server:latest
```

Buscamos la contraseña generada automáticamente durante la instalación:

```bash
sudo docker logs mysql-8 2>&1 | grep GENERATED
```

Podemos comprobar el estado de este contenedor listando los contenedores activos

```bash
docker ps
```

Y podemos comprobar que el puerto está en escucha correctamente

```bash
netstat -puntal | grep 3307
```

#### Configuración inicial

1. **Cambiar la constraseña de root**

Dentro de la consola MySQL

```bash
ALTER USER 'root'@'localhost' IDENTIFIED BY 'password';
```

2. **Añadir un usuario**

Dentro de la consola MySQL

```bash
# Creamos un usuario root exterior
CREATE USER 'root'@'%' IDENTIFIED BY 'password';
# Y le damos permisos
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
# Creamos una base de datos
CREATE DATABASE `project` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
# Creamos el usuario que va a acceder a esta base de datos
CREATE USER 'user'@'%' IDENTIFIED WITH mysql_native_password BY 'password';
# Le damos todos los permisos a la base de datos
GRANT ALL PRIVILEGES ON `project`.* TO 'user'@'%';
```

#### Uso

Entramos en la consola del contenedor

```bash
# Entrar en el docker
docker exec -it mysql-8 bash
# Entrar en mysql
mysql -uroot -p
```

O directamente en la consola de MySQL

```bash
# Requiriendo contraseña
docker exec -it mysql-8 mysql -u root -p
# Sin requerir contraseña
docker exec -it mysql-8 mysql -u root
```

#### Posibles fallos

1. **Poca memoria RAM** Si estamos en una máquina virtual, es posible que no le hayamos dedicado los recursos suficientes (>=1GB)

2. **No se ha generado la contraseña de root** Podemos ver una solución [aquí](https://stackoverflow.com/questions/48249912/change-mysql-password-in-docker-container)
    - [Otra solución](https://forums.docker.com/t/mysql-root-user-password-is-not-generated/86828) cambiando la contraseña