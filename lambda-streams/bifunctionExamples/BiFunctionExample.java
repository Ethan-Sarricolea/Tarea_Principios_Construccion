package bifunctionExamples;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /**
         * 
         * 
         */

        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> {
            return a + b;
        };

        // otra forma
        // 

         System.out.println("Resultado = " + biFunction.apply(10, 20));
    }
}
