---
- title: Lista de proyectos
---

# Berny

- Titulo:
- Descripción: Aplicación para  gestionar los trámites y preparativos de una boda

- Tablas de BBDD:
	- Invitados: Nombre, dieta, bus

- Ficheros: Imprimir resumen invitados.

- GitHub: [ProyectoFinalProgramacion](https://github.com/berny13/ProyectoFinalProgramacion.git)

# Jose

- Titulo: Teach&Learn
- Descripcion: Plataforma como OpenWebinars

- Tablas de BBDD:
	- Cursos: id, nombre, categoria, nivel, duracion
	- Usuarios: id, alias, nombre, contraseña, email, foto, rol
	- Curso-usuarios: idCurso, idUsuario, estado, nota

- Ficheros: Imprimir diploma (PDF), expediente academico.

- GitHub: [Proyecto_Programacion]()

# Manu

- Titulo: Build Maker
- Descripción: Calculador de juego RPG

- Tablas de BBDD:
	- Usuarios: 
	- Usuarios-personas:
	- Personajes:
	- Personajes-armamento:
	- Armamento:

- Ficheros: Exportar/Importar a la BBDD

- Avanzado: Sockets

- GitHub: [](https://github.com/Unam29/BuildMaker.git)

# Kike

- Titulo: 
- Descripcion: Aplicación para gesitonar un bar

- Tablas de BBDD:
	- Trabajadores: IdUser(PK), first\_name, last\_name, date\_of\_birth, DNI,tlf, registered_day, password, rol
	- Pedidos: idMesa, idComidas(FK),tipo,cantidad,precio
	- Comidas: idComidas(PK), nombre, cantidadAlmacen,Precio/und
	- Recibos: IdRecibo(PK), IdMesa,IdUser(FK), NombreCam,Precio,FechaTrans.,FormaPago
	- Caja: IdRecibo(FK), Importe, CajaActual,CajaFinal, FechaTrans.

- Ficheros: Resumen de reposición, factura de cliente.

- GitHub: [ProjectX](https://github.com/RaymanKing/ProjectX)

# Mario

- Titulo: Movies App
- Descripción: Aplicación para gesionar listas de películas
- Tecnología: stack MERN

- Tablas de BBDD:
	- Peliculas: id, movie_id, user_id, type
	- Usuarios: email, username, password, descripcion, imgUrl, date
	- Listas:

- Ficheros: Posiblemente, para la subida de imagenes de perfil de los usuarios. (Todavía no es seguro)

- GitHub: [MoviesApp](https://github.com/mariobalrod/MoviesApp)

# Espe

- Título:
- Descripción: Visor de casetas de la feria

- Tablas de BBDD:
	- Casetas: id, nombre, calle, aforoAct, aforoTot, estado, propiedad
	- Usuarios: id, nombre
	- Opiniones: id, idUser, idCaseta, comentario, estrellas
	- Usuario-caseta: idUser, idCaseta

- Ficheros: Exportar casetas favoritas

- GitHub: [Proyecto programacion](https://github.com/espejunco/ProyectoProgramacion.git)

# Juan Jesus (Limon)

- Titulo: 
- Descripcion: Gestor de personajes del Lol

- Tablas de BBDD:
	- Usuarios: id, alias, password
	- Personajes: id, nombre, region, historia.
	- Usuario-personaje: idUser, idPersonaje

- Ficheros: Exportar los personajes de un jugador

- GitHub: [ProgramacionTrabajo](https://github.com/Juan2707pog/ProgramacionTrabajo)

# Carlos

- Titulo: 
- Descripcion: Gestor de equipos y estadísticas de jugadores

- Tablas de BBDD: 
	- Equipos: id, nombre, pGanados, pEmpatados, pPerdidos
	- Jugadores: id, idEquipo, nombre, goles, ta, tr, minJugados
	- Usuarios: id, alias, password

- Ficheros: Exportar jugadores de un equipo

- GitHub: [ProyectoProgramacion](https://github.com/carlos-ada/ProyectoProgramacion.git)

# Adri

- Titulo: Cajero automático
- Descripción: Programa para gestionar el dinero en una cuenta.

- Tablas de BBDD:
	- Usuarios: id, usuario, contraseña
	- Cuentas: id, idUsuario, numeroCuenta, saldo
	- Movimientos: id, idCuenta, fecha, Concepto, Importe, Saldo

- Ficheros: Imprimir recibo ingresar/extraer dinero

- GitHub: [Cajero automatico](https://github.com/Adrian-Haba/Cajero-Automatico)

# Andrés

- Titulo:
- Descripcion: Aplicacion para gestionar un sistema de abonados a Semana Santa

- Tablas de BBDD:
	- Usuarios: id, nombre, usuario
	- Abonados: idAbonado, nombre, zona, sector
	- Sector:
	- Zona:
	- Abonado-zona-sector: idAbonado, idZona, idSector

- Ficheros: Imprimir las zonas permitidas para un abonado

- GitHub: []()

# Oscar

 - Titulo: M-all
 - Descripcion: Aplicacion de librería de música como Soundcloud

 - Tablas de BBDD:
 	- Canciones: id, titulo, duracion, idAutor, idDisco, fecha, archivo
 	- Disco: id, idAutor, titulo, fecha
 	- Autor: id, nombre
 	- Usuarios: id, usuario, contraseña

- Ficheros: Exportar autor con discos y canciones

- Avanzado: Reproducir canciones de un fichero

- GitHub: [M-all](https://github.com/oscarpadilla1907/M-all-DAW-Oscar-Padilla)

# Vladi

- Titulo:
- Descripcion: Juego de rol animado

- Tablas de BBDD:
	- Usuarios: id, user, password, nivel, puntuacion
	- Armas: id, nombre, poder
	- Niveles: numero, idEnemigo, nEnemigos
	- Enemigos: id, daño, velocidad

- Fichero: Exportar/Importar jugador

- GitHub: [Game](https://github.com/AntonioVladimir/Game)

# Sergio

- Titulo:
- Descripcion: Aplicacion de relaciones públicas para discotecas

- Tablas de BBDD:
	- Eventos: id, nombre, descripcion, edadAcceso, aforo, lugar, fecha
	- Usuarios: dni, nombre, contraseña, fechaNacimiento
	- Usuario-evento: idUsuario, idEvento

- Fichero: Exportar Lista de personas del evento

- GitHub: []()

# Pablo 

- Titulo:
- Descripcion: Gestor de morosos

- Tablas de BBDD:
	- Usuarios: dni, nombre, contraseña
	- Morosos: dni, nombre
	- usuario-moroso: dniUser, dniMoroso, deuda, fecha

- Ficheros: Exportar la lista de morosos de un usuario

- Avanzado: Filtrar por deuda mayor que X

- GitHub: [NullMorosos]()

# Jose Antonio

- Titulo:
- Descripcion: Tienda de juegos

- Tablas de BBDD:
    - Juegos: id, titulo, genero, precio, cantidad
    - Compradores: id, nombre, apellidos
  	- Ventas: id, idComprador, idJuego, fecha

- Ficheros:
	- Imprimir factura de una misma fecha

- GitHub: [Proyecto](https://github.com/Josearemos/ProyectoProgramacion)

# Rafa

- Titulo: 
- Descripcion: Plataforma de juegos al estilo Steam o EpicGame

- Tablas de BBDD:
    - Usuarios: id, user, password, credito
    - Amigos: idUser1, idUser2
    - Juegos: id, titulo, descripcion, imagen, precio
    - ListaJuegos: idJuego, idUsuario, estado

- Ficheros:
    - Imprimir lista de juegos de un usuario (Markdown)
    - Imprimir factura de compra (Markdown)
    - Recordar inicio sesion

- GitHub: [Proyecto](https://github.com/Rafael-bot/ProyectoFinal1-GradSup)

# Carlos García

- Titulo: 
- Descripcion: Aplicacion para gestor de trabajadores

- Tablas de BBDD:
    - Usuarios: user, password, rol
    - Empleados: dni, nombre, fechaNacimiento, correo, categoria

- Avanzado: 
	- Tabla usuario-empleado o campo nuevo dni (FK de Empleados) en user

- Ficheros:
	- Escritura: Imprimir datos de un empleado
	- Lectura: Leer contraseña secreta (encriptada ASCII) para crear un admin

- GitHub: []()

# Javier Melendez

- Titulo: 
- Descripcion: Juego por turnos de DragonBall

- Tablas de BBDD:
	- Personajes: id, nombre, vida, ataque, defensa
	- Habilidades: id, nombre, poder, tipo
	- Personaje-habilidad: idPersonaje, idHabilidad

- Avanzado: Asignar requistos para lanzar habilidades.

- Ficheros: Importar/Exportar BBDD a un .csv

- GitHub: [DragonBallM](https://github.com/titomelen/ProyectoProgramacion)

# Angela

- Titulo: 
- Descripcion: Biblioteca de música

- Tablas de BBDD:
	- Canciones: id, nombre, autor, duracion, tipo
	- Albums: id, nombre, autor
	- Album-cancion: idCancion, idAlbum

- Ficheros:
	- Imprimir todas las canciones de un autor
	- Imprimir el contenido de un album

- GitHub: [Biblioteca de Musica](https://github.com/Angela1395/Bibliotecamusica)

# Jesus

- Titulo: 
- Descripcion: Gestor de equipos de baloncesto

- Tablas de BBDD:
	- Jugadores: id, nombre, equipo, posicion, titular
	- Equipos: nombre, victoria, derrota, empate

- Ficheros: Exportar titulares de un equipo

- GitHub: []()

# Alex

- Titulo: 
- Descripcion: Almacen de coches y objetos

- Tablas de BBDD:
	- Coches: id, marca, modelo, precio, cantidad
	- Objetos: id, nombre, descripcion, precio, cantidad

- Ficheros: Imprimir lista de coches y objetos

- GitHub: []()

# Marco

- Titulo:
- Descripcion: Aplicación de gestión de divisas

- Tablas de BBDD:
	- Divisas: id (ISO 4217), nombre, acronimo, valor
	- Cliente: id, nombre, apellido, nombrePais, user, password, credito
	- Pais: nombre, idDivisa, idioma

- Ficheros:
	- Reporte del estado actual de las divisas respecto a una dada.
	- Exportar el dinero del cliente en todas las divisas.

- Avanzado: Implementación de idiomas

- [Proyecto](https://github.com/coti1999/ProyectosProgramacion.git)
