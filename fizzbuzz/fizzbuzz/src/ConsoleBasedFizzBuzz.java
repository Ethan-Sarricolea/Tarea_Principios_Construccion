/**
 * Composición / Metodo en linea
 *      (Ahora isMultiplo no utiliza el if-else)
 * Extraer metodo
 *      (Separe la logica en print)
 * Evitar numeros magicos
 *      (usar las variables de los multiplos de 5 y 3)
 * Evitar repetir la llamada de metodos
 *      (al usar multiploTres y multiploCinco solo llamo una vez a isMultiplo)
 */

class ConsoleBasedFizzBuzz implements FizzBuzz{
    private boolean multiploTres = false;
    private boolean multiploCinco = false;

    @Override
    public void print(int from, int to) {
        
        for (int i = from; i <= to; i++) {
            // Ver si son multiplos
            multiploTres = isNotMultiplo(i,3);
            multiploCinco = isNotMultiplo(i,5);

            // Comprobar que se debe imprimir
            if (multiploCinco || multiploTres) {
                System.out.println((multiploTres ? "Fizz" : "") + (multiploCinco ? "Buzz" : ""));
            } else {
                System.out.println(i);
            }
        }
    }

    // Separar la responsabilidad 
    public static boolean isNotMultiplo(int number, int base){
        if ((number % base) != 0) {
            return false;
        } else {
            return (Integer.toString(numero));
        }
    }

    public static boolean isMultiplo(int number, int base){
        return ((number % base) == 0);
    }
}