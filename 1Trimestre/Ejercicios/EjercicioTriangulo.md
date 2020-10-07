---
title: Ejercicios For
subtitle: Construyendo el triángulo por consola
author: Gabriel Rodríguez Flores
date: \today
---

# Ejercicios en clase

1. Imprimir con un `for` los números del 1 hasta N en vertical

```java
int n = 4;
for (int i = 1; i <= n ;i++ ) { // Recorro i desde 1 hasta n
	System.out.println(n); // Importante el 'ln' o salto de línea
}
```

Salida esperada con n = 4:

```bash
1
2
3
4
```

2. Imprimir en cada línea, el número de la columna como el valor de n

```java
int n = 4;
for (int i = 1; i <= n ; i++ ) { // Bucle de las filas
	for (int j = 1; j <= n ; j++ ) { // Bucle de las columnas
		System.out.print(j); // Importante SIN 'ln'
	}
	System.out.println(); // Inserto un salto de línea cuando finalizo la columna
}
```

Salida esperada con n = 4:

```bash
1234
1234
1234
1234
```

3. Imprimir en cada línea, tantas veces el número de la fila como el valor de n

```java
int n = 4;
for (int i = 1; i <= n ; i++ ) {
	for (int j = 1; j <= n ; j++ ) {
		System.out.print(i); // Cambio la 'j' por la 'i'
	}
	System.out.println();
}
```

Salida esperada con n = 4:

```bash
1111
2222
3333
4444
```

4. Imprimir el número de la fila tantas veces como indique su valor

```java
int n = 4;
for (int i = 1; i <= n ; i++ ) {
	for (int j = 1; j <= i ; j++ ) { // Cambio la 'n' por la 'i'
		System.out.print(i); 
	}
	System.out.println();
}
```

Salida esperada con n = 4:

```bash
1
22
333
4444
```

5. Realizar un triangulo retángulo de catetos de tamaño N

```java
int n = 4;
for (int i = 1; i <= n ; i++ ) {
	for (int j = 1; j <= i ; j++ ) {
		System.out.print("*"); // Cambio la 'i' por la un caracter '*'
	}
	System.out.println();
}
```

Salida esperada con n = 4:

```bash
*
**
***
****
```

6. Realizar un triángulo como el anterior, pero invertido.

```java
int n = 4;
for (int i = 1; i <= n ; i++ ) {
	for (int j = n; j >= i ; j-- ) { // Cambio el orden: desde i hasta 1
		System.out.print("*"); 
	}
	System.out.println();
}
```

Salida esperada con n = 4:

```bash
****
***
**
*
```

7. Realizar el triángulo anterior pero alineado a la derecha

```java
int n = 4;
for (int i = 1; i <= n ; i++ ) {
	for (int j = 1; j < i ; j++ ) { // Este for es el triangulo de espacios invisibles
		System.out.print(" ");
	}
	for (int j = n; j >= i ; j-- ) {
		System.out.print("*"); 
	}
	System.out.println();
}
```

Salida esperada con n = 4:

```bash
****
 ***
  **
   *
```

8. Realizar el triángulo Triángulo equilátero

```java
int n = 4;
// Opcion A
for (int i = 1; i <= n ; i++ ) {
	for (int j = n; j > i ; j-- ) {
		System.out.print(" "); 
	}
	for (int j = 1; j <= i ; j++ ) {
		System.out.print("*");
	}
	for (int j = 1; j < i ; j++ ) {
		System.out.print("*");
	}
	System.out.println();
}
// Opcion B
for (int i = 1; i <= n ; i++ ) {
	for (int j = n; j > i ; j-- ) {
		System.out.print(" "); 
	}
	for (int j = 1; j <= i*2-1 ; j++ ) { // Este for es el triangulo de espacios invisibles
		System.out.print("*");
	}
	System.out.println();
}
```

Salida esperada con n = 4:

```bash
   *
  ***
 *****
*******
```

9. Realizar un arbol dinámico

```java
int triangulos = 5;
for (int n=2; n<triangulos ;n++ ) {	
	for (int i = 1; i <= n ; i++ ) {
        for(int j = n; j < triangulos; j++ ){
            System.out.print(" ");
        }
		for (int j = n; j > i ; j-- ) {
			System.out.print(" "); 
		}
		for (int j = 1; j <= i*2-1 ; j++ ) { // Este for es el triangulo de espacios invisibles
			System.out.print("*");
		}
		System.out.println();
	}
}
```

Salida esperada con n = 4:

```bash
    *
   ***
    *
   ***
  *****
    *
   ***
  *****
 *******
```
