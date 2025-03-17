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

    @Override
    public void print(int from, int to) {
        
        for (int i = from; i <= to; i++) {
            System.out.println(this.comprobarNumero(i));
        }
    }

    public String comprobarNumero(int numero){
        boolean multiploTres = isMultiplo(numero,3);
        boolean multiploCinco = isMultiplo(numero,5);

        if (multiploCinco || multiploTres) {
            return((multiploTres ? "Fizz" : "")
                    + (multiploCinco ? "Buzz" : ""));
        } else {
            return (Integer.toString(numero));
        }
    }

    public static boolean isMultiplo(int number, int base){
        return ((number % base) == 0);
    }
}

// Sarricolea Cortés Ethan Yahel