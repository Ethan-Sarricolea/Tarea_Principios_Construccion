/**
 * BiConsumer
 */

package biconsumer;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        

        BiConsumer<String, String> biConsumer = (param1, param2) -> {
            System.out.println("BiConsumer: " + param1 + " " + param2);
        };

        // Otra forma de escribirlo
        // BiConsumer<String, String> biConsumer = (param1, param2) -> System.out.println(param1 + " " + param2);
        // La forma de los :: solo funciona con un parametro

        biConsumer.accept("Hello", "World");
    }   
}
