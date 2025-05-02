## Práctica de Refactorización en Java: Sistema de Gestión de Biblioteca

El propósito es aplicar técnicas de refactorización a un código Java con problemas de diseño, implementando los principios de la programación orientada a objetos para mejorar su calidad, mantenibilidad y extensibilidad.

El código que se proporciona corresponde a un sistema básico para la gestión de una biblioteca: registrar libros, usuarios y préstamos. La aplicación funciona, pero presenta varios problemas de diseño como:

- Violación del principio de responsabilidad única

- Alto acoplamiento entre clases

- Código duplicado

- Métodos excesivamente largos

- Uso inadecuado de la herencia

- Falta de encapsulamiento

- Nomenclatura inconsistente

- Con base en el código funcional que se adjunta, realiza refactorización para mejorar el sistema. 

Sigue y realiza las indicaciones que se indican en el documento adjunto.

---

### Refactorizacion

1. Se agrego un override de toString a las clases y se remplazo dentro del codigo App para simplificar y disminuir el codigo

2. Consumir el salto de linea no parece ser necesario en todos los casos
```java
scanner.nextLine();  // Consumir el salto de línea
```
Si es necesario pero solo en ciertos casos, en el caso de para prestar libro no parece ser necesario el consumir el salto de linea posterior al nextInt(), ya que debe limpiearze si despues de un nextInt va un nextLine de entrada para evitar errores.
La linea se elimino en los metodos:
    
- prestarLibro
- devolverLibro

3. Se convirtieron los Switch en rule switch para mejorar la comprensión del codigo

4. Se convirtio los arreglos de libros, usuarios, prestamos y scanner en final.

---

AUN SE PUEDEN SEPARAR COSAS, BUSCAR LIBRO TIENE CODIGOS SIMILARES