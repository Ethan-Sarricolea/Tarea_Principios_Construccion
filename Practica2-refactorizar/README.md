## Práctica de Refactorización en Java: Sistema de Gestión de Biblioteca

El propósito es aplicar técnicas de refactorización a un código Java con problemas de diseño, implementando los principios de la programación orientada a objetos para mejorar su calidad, mantenibilidad y extensibilidad.

El código que se proporciona corresponde a un sistema básico para la gestión de una biblioteca: registrar libros, usuarios y préstamos. La aplicación funciona, pero presentaba varios problemas de diseño como:

- Violación del principio de responsabilidad única
- Alto acoplamiento entre clases
- Código duplicado
- Métodos excesivamente largos
- Uso inadecuado de la herencia
- Falta de encapsulamiento
- Nomenclatura inconsistente

---

### Cambios realizados durante la refactorización

1. **Separación de responsabilidades**:
   - Se crearon clases específicas (`LibroService`, `UsuarioService`, `PrestamoService`) para manejar las operaciones relacionadas con libros, usuarios y préstamos, siguiendo el principio de responsabilidad única (SRP).

2. **Eliminación de código duplicado**:
   - Se reemplazaron bucles repetidos para buscar libros y usuarios con métodos reutilizables y el uso de Streams.

3. **Uso de `toString`**:
   - Se agregó un override del método `toString` en las clases `Libro`, `Usuario` y `Prestamo` para simplificar la impresión de objetos.

4. **Uso de `Optional`**:
   - Se implementó `Optional` para manejar búsquedas de libros y usuarios, evitando valores nulos.

5. **Modularización del menú**:
   - La lógica del menú principal se movió a una clase `MenuHandler` para mejorar la legibilidad y reducir la complejidad del método `main`.

6. **Uso de `final`**:
   - Se declararon como `final` las listas de libros, usuarios, préstamos y el objeto `Scanner` para evitar modificaciones accidentales.

7. **Simplificación de `switch`**:
   - Se reemplazaron los `switch` tradicionales por `rule switch` para mejorar la claridad del código.

8. **Separación de inicialización de datos**:
   - La inicialización de datos de ejemplo se movió a una clase `DataInitializer`.

---

### Instrucciones para compilar y ejecutar el proyecto

1. **Requisitos previos**:
   - Asegúrate de tener instalado [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) versión 8 o superior.
   - Configura la variable de entorno `JAVA_HOME` y añade el directorio `bin` del JDK al `PATH`.

2. **Compilación**:
   - Abre una terminal en el directorio raíz del proyecto.
   - Ejecuta el siguiente comando para compilar todos los archivos `.java`:
     ```bash
     javac -d bin src/*.java
     ```
   - Esto compilará los archivos fuente y generará los archivos `.class` en el directorio `bin`.

3. **Ejecución**:
   - Una vez compilado, ejecuta la aplicación con el siguiente comando:
     ```bash
     java -cp bin BibliotecaApp
     ```

4. **Pruebas**:
   - Si el proyecto incluye pruebas unitarias, asegúrate de ejecutarlas con un framework como JUnit. Por ejemplo:
     ```bash
     java -cp bin:lib/junit-4.13.2.jar org.junit.runner.JUnitCore NombreDeLaClaseDePrueba
     ```

---

### Notas adicionales

- **Estructura del proyecto**:
  - `src/`: Contiene los archivos fuente del proyecto.
  - `bin/`: Contendrá los archivos compilados después de ejecutar el comando `javac`.

- **Próximos pasos**:
  - Se pueden realizar más mejoras, como implementar un sistema de persistencia para guardar los datos de libros, usuarios y préstamos en un archivo o base de datos.
  - Considerar el uso de un framework como Spring para manejar la inyección de dependencias y mejorar la escalabilidad del sistema.