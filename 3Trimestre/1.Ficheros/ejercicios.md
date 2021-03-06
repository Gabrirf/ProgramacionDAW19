---
title: Ejercicios de ficheros
author: Gabriel Rodríguez Flores
---

# Base teórica

Teoría básica sacada de [aquí](https://jarroba.com/lectura-escritura-ficheros-java-ejemplos/)

Mejora y más concreto en [W3Schools](https://www.w3schools.com/java/java_files.asp)

## Lectura

Necesitaremos las librerías

```java
import java.io.File;
import java.util.Scanner;
```

Código:

```java
File fichero = new File("files/fichero.txt");
try{
    Scanner lector = new Scanner(fichero);
    while(lector.hasNextLine()){
        cont += 1;
        String linea = lector.nextLine();
        System.out.println( cont +"\t"+ linea);
    }
}catch(FileNotFoundException e){
    System.out.println(e);
}finally{
    lector.close();
}
```

Vease también _FileReader_ y _BufferedReader_. [Más información](https://stackoverflow.com/questions/20838244/difference-between-buffered-reader-and-file-reader-and-scanner-class#answer-20838298)

## Escritura

Necesitaremos las librerías

```java
import java.io.FileWriter;
```

Código:

```java
FileWriter fichero = null;
try {
    fichero = new FileWriter("fichero_escritura.txt");
    for (int i=0; i<10; i+=1) {
        fichero.write(i + "\n");
    }
    fichero.close();
} catch (Exception e) {
    System.out.println(e);
}
```

Para un ejemplo sencillo con _BufferedWriter_ vease este [tutorial](https://geekytheory.com/com o-crear-y-modificar-ficheros-con-java)

# Ejemplos

- **Información del objeto `File`**

```java
File file = new File("filename.txt");
if (file.exists()) {
    if(file.isDirectory()){
        for (String name : file.list()){
			System.out.println(name);
        }
    }else{
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getPath()); 
        System.out.println("Absolute path: " + file.getAbsolutePath()); 
        System.out.println("Writeable: " + file.canWrite()); 
        System.out.println("Readable " + file.canRead()); 
        System.out.println("File size in bytes " + file.length());
        System.out.println("Last modified " + file.lastModified());
        //System.out.println(file.delete());
    }
} else {
    System.out.println("The file does not exist. Creating directory ...");
    System.out.println(file.mkdir());
}
```

- ****

# Ejercicios

## Lectura

1. Crea un programa que muestre el contenido de un fichero de texto, cuyo nombre deberá introducir el usuario. Debe avisar si el fichero no existe.

2. Programa que imprima la primera y última línea de un fichero.
    * Igual con las 3 primeras y 3 últimas líneas

3. Realizar un programa que pide autenticar un usuario, introduciendo usuario y contraseña, las cuales estarán almacenadas en un fichero llamado `.credenciales`, y cuyo contenido será el nombre del usuario en la primera línea y la contraseña en la segunda.
    - **Mod1:** Realizar el mismo programa pero en el fichero los datos serán almacenados como _usuario / contraseña_ en la misma línea.
    - **Mod2:** Habilitar para varios usuarios.

4. Programa que lea un fichero y haga un recuento de cuantos:
    - Parrafos
    - Palabras
    - Vocales

5. Realizar un buscador de palabras dentro de un fichero. El usuario introducirá una palabra a buscar, e imprimirá por consola el número de veces que esa palabra ha sido localizada en el fichero.
    - **Mod1:** Imprimir el número de la línea en la que se ha encontrado la palabra.
        - Se debe evitar repetir el número de linea poniendo entre paréntesis las repeticiones.
    - **Mod2:** El usuario también puede introducir el nombre del fichero donde lo quiere buscar
    - **Mod3:** Se buscará en todos los ficheros con extensión `.txt`

6. Programa que encuentre la palabra más larga de un fichero.

## Escritura

1. Crea un programa que pida al usuario que introduzca frases, y guarde todas ellas en un fichero de texto. Deberá terminar cuando el usuario introduzca "fin".

2. Programa que cree un documento con el formato de Markdown, incluyendo un menú para que el usuario seleccione que quiere insertar:
    - Cabecera
        - Indicar el nivel de la cabecera (1-6)
    - Párrafo
    - Lista
        - Numerada o sin numerar
    - Código
        - Lenguaje (a seleccionar de una lista)

3. Creador de clases java:
    - Nombre
    - Variables
        - Seleccionar tipo
    - Constructores
        - Vacío y completo
    - Getter/Setter
    - toString

## Lectura y Escritura

1. Crea un programa que lea el contenido de un fichero de texto y lo vuelque a otro fichero de texto, pero convirtiendo cada línea a mayúsculas.

2. Programa que edite un fichero de texto añadiendole una frase solicitada al usuario.
    - **Mod1:** Elegir la línea en la que insertar la frase

3. Programa que codifique/decodifique un texto en ASCII y guarde en el fichero el texto codificado en numérico. Mostrará por consola el contenido en texto.

4. Programa que permita recoger datos de un fichero `.csv` y cargue un array de objetos a partir de él. El programa permitirá añadir nuevos objetos que deberán ser añadidos al fichero para la persistencia de los datos.