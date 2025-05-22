package streamsexamples;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        // Esta lista / arreglo convertirlas a streams
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using Stream API to filter and print names that start with 'A'
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}