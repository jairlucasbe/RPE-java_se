# Ejercicios de Programación

---
#### Jair Lenin Lucas Benavides

Este repositorio alberga una serie de ejercicios de programación resueltos, implementados en el lenguaje de programación Java. Cada ejercicio está diseñado para ilustrar y aplicar conceptos clave del lenguaje, abarcando desde fundamentos básicos hasta técnicas avanzadas

## Fundamento de programación
### Estructura de control de flujo
 1. **ChristmasTree** : El ejercicio de ChristmasTree requiere que el usuario ingrese un número que represente la altura del árbol, excluyendo el tronco. El árbol debe imprimirse usando asteriscos (*) y debe estar perfectamente centrado. Después de imprimir el árbol, también se debe imprimir el tronco, y debe estar centrado con respecto al árbol.

### Programación Orientada a Objetos
1. **Book Management System** :
   2. **Descripción:** Desarrolla un programa en Java para gestionar una colección de libros. Cada libro debe tener un título, autor, número de páginas y un estado (prestado o disponible).
   3. **Requisitos:** 
   - Crea una clase Libro con los atributos titulo, autor, numeroPaginas, y prestado. Incluye un constructor para inicializar estos atributos, así como los métodos prestar() y devolver() para cambiar el estado del libro, estado() para verificar si está prestado o disponible, y mostrarInformacion() para mostrar los detalles del libro. 
   - Luego, implementa una clase Biblioteca que tenga una lista de libros (ArrayList<Libro>). Esta clase debe incluir métodos como agregarLibro(Libro libro) para añadir un libro a la biblioteca, mostrarLibrosDisponibles() para listar los libros no prestados, buscarLibroPorTitulo(String titulo) para encontrar un libro por su título, prestarLibro(String titulo) para prestar un libro disponible, y devolverLibro(String titulo) para devolver un libro prestado.

   - Finalmente, en la clase Main, crea varios objetos de tipo Libro y añádelos a un objeto de tipo Biblioteca. Muestra la información de los libros, realiza préstamos y devoluciones, y muestra la información actualizada.

   4. **Objetivo:**
   Este ejercicio te ayudará a practicar la creación de clases, el manejo de objetos y la implementación de métodos que operan sobre los atributos de clase.
