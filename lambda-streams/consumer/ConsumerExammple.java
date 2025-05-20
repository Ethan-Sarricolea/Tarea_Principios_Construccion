/**
 * Consumer
 */

package consumer;
import java.util.function.Consumer;

public class ConsumerExammple {
    public static void main(String[] args) {
        /**
         * Consumer
         * Recibe y no retorna
         */
        Consumer<String> consumer = (param) -> {
            System.out.println("Consumer: " + param);
        };
        
        // Otra forma de escribirlo
        // Consumer<String> consumer = (param) -> System.out.println(param);
        // Consumer<String> consumer = System.out::println;

        consumer.accept("Hello, World!");
    }
}