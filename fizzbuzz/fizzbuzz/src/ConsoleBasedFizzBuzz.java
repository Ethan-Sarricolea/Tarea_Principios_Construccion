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
            return true;
        }
    }
}