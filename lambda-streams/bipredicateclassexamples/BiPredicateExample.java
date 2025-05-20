package bipredicateclassexamples;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        /**
         * Bi predicate
         */

        //  No es necesario indicar el retorno booleano porque seria redundante
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
            return a > b;
        };

        System.out.println(biPredicate.test(10, 5));
    }
}
