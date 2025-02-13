# Clean code

@Ethan-Sarricolea

## Instrucciones:

Elabora programa en Java para llevar el control del personal de la selección Mexicana de Futbol. Considera los siguientes diagramas e implementa la herencia para disminuir la duplicidad de código y aplica los principios del código limpio. Utiliza las convenciones de código "Google Java Style Guide" y describe dentro del código (con comentarios) la regla aplicada con base en la guía; mínimo 5 reglas.

Google Java Style Guide: https://google.github.io/styleguide/javaguide.html

## Solucion

### Clases

- App
- Person
- Futbolista
- Masajista
- Entrenador

Funciones en App:
- Agregar trabajador
- Visualizar
    - Filtrar por tipos (1, 2 o 3)
    - Visualizar
- Volver
- Salir

![alt text](img\image.png)

Reglas aplicadas:

1. **7.3.4**. Cada vez que se utilizaría un comentario de implementación para definir el propósito general o el comportamiento de un clase o miembro, ese comentario se escribe como Javadoc (usando /**).

2. **5.2.1**. Los nombres de los paquetes usan solo letras en minúsculas y dígitos.

3. **5.2.2**. Nombres de clases en UperCamelCase.

4. **5.2.3**. Los nombres de los metodos se escriben en lowerCamelCase.

5. **4.4**. Los atributos deben ser privados por encapsulamiento.

6. **7.1.3**. Cuando una etiqueta de bloque no cabe en una sola línea, las líneas de continuación están sangrados cuatro (o más) espacios desde la posición.

7. **6.1**. Siempre utilizar marcado @override para la sobreescritura.

8. **4.6.1**. Los atributos se declaran al inicio de la clase antes del constructor o los metodos.

9. **4.8.2** Inicializar los atributos en el constructor o directamente en la declaración si constante.

10. **5.2.5**. Atributos escritos en lowerCamelCase.

11. **4.6.3**.Usar Javadoc para documentar atributos si no son obvios.