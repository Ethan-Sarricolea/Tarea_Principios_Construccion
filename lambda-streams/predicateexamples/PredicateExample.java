package predicateexamples;
import java.util.function.Predicate;


public class PredicateExample {
    /**
     * Recibe un valor y devuelve un booleano
     */

    public static void main(String[] args) {
        Predicate<String> predicate = (str) -> {
            return (str.length() > 5); // Verdadero si el texto es mayor a 5
        };
        System.out.println(predicate.test("HolaMundo"));
    }
}
