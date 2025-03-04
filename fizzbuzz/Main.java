/**
 * Author:
 * Description: Imprimir los numeros del 1 al 100, pero si el numero es multiplo de 3 imprime Fizz,
 * Si es multiplo de Buzz imprime Buzz y si es multiplo de ambos imprime FizzBuzz
 */

class Main {
    public static void main(String[] args) {
        ConsoleBasedFizzBuzz var = new ConsoleBasedFizzBuzz();
        var.print(1, 100);
    }
}