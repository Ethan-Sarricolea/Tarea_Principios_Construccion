# Clean code

## Instrucciones:

Elabora programa en Java para llevar el control del personal de la selección Mexicana de Futbol. Considera los siguientes diagramas e implementa la herencia para disminuir la duplicidad de código y aplica los principios del código limpio. Utiliza las convenciones de código "Google Java Style Guide" y describe dentro del código (con comentarios) la regla aplicada con base en la guía; mínimo 5 reglas.

Google Java Style Guide: https://google.github.io/styleguide/javaguide.html

## Solucion

### Clases

App
Person
Futbolista
Masajista
Entrenador

Registrar los trabajadores
Cada tipo tiene un id / indice en la lista de tipos

1. Futbolista
2. Entrenador
3. Masajista

en App:
- Agregar trabajador
- Visualizar
    - Filtrar por tipos (1, 2 o 3)
    - Visualizar
- Volver
- Salir

![alt text](img\image.png)