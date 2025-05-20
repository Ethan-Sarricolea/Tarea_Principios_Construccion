/**
 * Supplier
 * No recibe y retorna
 */


package suplayerexample;
import java.util.function.Supplier;

public class SuplayerExample {
    public static void main(String[] args) {
        /**
         * Supplier
         * No recibe y retorna
         */
        Supplier<String> supplier = () -> {
            return "Hello, World!";
        };
        
        // Otra forma de escribirlo
        // Supplier<String> supplier = () -> "Hello, World!";
        // Supplier<String> supplier = () -> { return "Hello, World!"; };
        // Supplier<String> supplier = () -> "Hello, World!";
        // Supplier<String> supplier = String::new;

        System.out.println(supplier.get()); // se llama el resultado con get()
    }
}
