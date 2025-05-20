package runnablesexamples;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hola");

        runnable.run();
    }
}
