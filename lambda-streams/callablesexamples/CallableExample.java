package callablesexamples;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /**
         * Callable
         */
        Callable<String> callable = () -> {
            return "Resultado de la tarea";
        };

        // Try enn la llamada
        try {
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }   
    }
}
