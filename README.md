# Cálculo de la distancia de edición

Este proyecto implementa una calculadora de distancias entre dos cadenas de texto utilizando el algoritmo de distancia de edición, como se describe en el libro de Jurafsky.

## Descripción

La Calculadora de Distancias es una herramienta que implementa el algoritmo de distancia de edición, también conocido como distancia de Levenshtein, para calcular la diferencia entre dos cadenas de texto. Este algoritmo determina el número mínimo de operaciones requeridas para transformar una cadena en otra, donde las operaciones permitidas son inserción, eliminación o reemplazo de un solo carácter.

La implementación sigue el enfoque descrito por Jurafsky para calcular la distancia de edición entre dos cadenas s1 y s2. Utiliza una matriz dinámica para almacenar las distancias parciales entre subcadenas, lo que permite calcular la distancia total de manera eficiente.

## Documentacion
Proyecto creado por Carlota Ruiz Campesino Version1.0 Fecha de creación 12/04/2024.

## Instalación
Clona este repositorio a tu máquina local utilizando el siguiente comando:
git clone https://github.com/carlotacrc/Practica4.git

## Cómo Iniciar la Aplicación
1. Compila todas las clases presentes en el proyecto.
2. Ejecuta la clase Principal, la cual contiene el método main.
3. Sigue las indicaciones para llevar a cabo las operaciones deseadas.

## Instrucciones de Uso

1. Clone este repositorio en su máquina local.
2. Abra el proyecto en su entorno de desarrollo preferido (por ejemplo, IntelliJ IDEA, Eclipse, etc.).
3. Ejecute el archivo `Principal.java` ubicado en el paquete `aplicacion`.
4. Define las cadenas de texto entre las cuales deseas calcular la distancia.

Ejemplo de uso:
String s1 = "perro";
String s2 = "terror";
La distancia entre perro y terror es: 5


## Estructura del Proyecto

- La carpeta src: Contiene el código fuente del proyecto.
  - El paquete dominio: Contiene la clase `CalculadoraDistancias` que implementa una calculadora de distancias entre dos cadenas de 
  texto utilizando el algoritmo de distancia de edición.
  - El paquete aplicacion: Contiene la clase `Principal` que contiene el método `main` para ejecutar el programa y mostrar el resultado.
- README.md: Documentación del proyecto que explica su funcionamiento, estructura y uso.
- LICENSE: Archivo de licencia del proyecto que especifica los términos de uso y distribución.
- .gitignore: Archivo que especifica qué archivos y directorios se deben ignorar en el control de versiones Git.

## Dependencias

JDK 8 o superior.

## Licencia

Copyright 2024 © Carlota Ruiz Campesino Este proyecto está bajo la licencia [LICENSE].

## Contacto

Para consultas y comentarios contactar a Carlota Ruiz Campesino. Correo: carlota.ruizcampesino@usp.ceu.es Telefono: 628791353.