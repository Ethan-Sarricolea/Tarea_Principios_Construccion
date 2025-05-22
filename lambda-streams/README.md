# Funciones lambda y api streams


# Funciones lambda

### Consumer

- Recibe un valor y no retorna nada.
- Es una funcion anonima que obtiene el valor pero no devuelve nada

```java
Consumer<String> consumer = (param) -> {
    System.out.println("Consumer: " + param);
};
consumer.accept("Hello, World!");
```

### Bi Consumer

Esta funcion recibe **dos valores** y no retorna nada, no retorna nada porque es un consumer, es decir, noo retorna.

```java
BiConsumer<String, String> biConsumer = (param1, param2) -> {
    System.out.println("BiConsumer: " + param1 + " " + param2);
};

biConsumer.accept("Hello", "World");
```

### Suplayer

No recibe parametros pero retorna un resultado

```java
Supplier<String> supplier = () -> {
    return "Hello, World!";
};

System.out.println(supplier.get());
```

### Function

Recibe y retorna un valor.

```java
Function<String, String> function = (param) -> {
    return "Function: " + param;
};

System.out.println(function.apply("Hello, World!"));
```

### Bi Function

Recibe **dos parametros** y retorna un resultado

```java
BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> {
    return a + b;
};

System.out.println("Resultado = " + biFunction.apply(10, 20));
```

### Predicate

Recibe un valor y devuelve un booleano

```java
Predicate<String> predicate = (str) -> {
    return (str.length() > 5); // Verdadero si el texto es mayor a 5
};
System.out.println(predicate.test("HolaMundo"));
```

### Bi predicate

```java
//  No es necesario indicar el retorno booleano porque seria redundante
BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
    return a > b;
};

System.out.println(biPredicate.test(10, 5));
```

### Binari Operator

Recibe (dos parametros) y retorna valores del mismo tipo.

```java
BinaryOperator<Integer> binaryOperator = (a,b) -> a + b;

System.out.println(binaryOperator.apply(10, 10));
```

### Unary

Recibe (un solo valor) y retorna otro del mismo tipo

```java
UnaryOperator<Integer> unaryOperator = number -> number*number;

System.out.println(unaryOperator.apply(5));
```

#### A partir de ahora son funciones usadas para hilos, promesas y concurrencia usando los future (cosas asincronas, etc).

### Runnable

Muy usada en multihilos, no recibe ni retorna nada, solo ejecuta una tarea

```java
Runnable runnable = () -> System.out.println("hola");

runnable.run();
```

### Callable

No recibe valores pero retorna resultado y **puede lanzar una excepción**

```java
Callable<String> callable = () -> { return "Resultado de la tarea" };

// Try enn la llamada
try {
    callable.call();
} catch (Exception e) {
    throw new RuntimeException(e);
}  
```

# Streams

Un stream es un flujo de datos que pasan por una especie de tuberia, donde se opera con ellos uno por uno.

Es decir, a la entrada entra algo y a la salida sale lo mismo pero modificado, filtrado o procesado.

Tiene dos tipos de operadores **finales y no finales**

- El operador final termina el flujo
- El no final continua el flujo despues de terminar con el (es decir, se puede realizar mas procesos despues)

## Operadores no finales

- filter()
- map() transfrma los elemntos
- sorted() acomoda los valores
- distinct() elimina los duplicados
- limit() limita las operaciones
- skip() omite un numero especifico de elementos
- allMatch() verifica que todos cumplan la condición
- anyMatch() verifica si algun elemento cumple con la condición
- noneMatch() verifica si nadie la cumple

## Operadores finales

- forEach()
- reduce (binary operator) concatena los valores en uno solo
- collect() recoge los elementos enn una coleccion

```java
// Esta lista / arreglo convertirlas a streams
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

// Using Stream API para llamar un consumer
names.stream()
    .filter( (name) -> name.startsWith("A"))
    .map(Strung::toUpperCase())
    .forEach(Systen.out::println);

// Reduce
names.stream()
    .reduce("Resultado: ", (a, b) -> a + " " + b)
    .forEach(System.out::println);

// Collector
List<String> result = names.stream()
    .map( (name) -> name.toUppercase())
    .collect(Collectors.toList()); // o solo con toList()

result.stream().forEach(System.out::println);
```



