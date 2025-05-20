package functionexample;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /**
         * Function
         * Recibe y retorna
         */

        //  Recibe string y retorna string, por eso <String, String>
        Function<String, String> function = (param) -> {
            return "Function: " + param;
        };
        
        // Otra forma de escribirlo
        // Function<String, String> function = (param) -> "Function: " + param;
        // Function<String, String> function = String::new;

        System.out.println(function.apply("Hello, World!")); // se llama el resultado con apply()
    }
}
