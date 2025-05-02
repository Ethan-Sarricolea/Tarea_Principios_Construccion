class ConsoleBasedFizzBuzz implements FizzBuzz{
    private booleano multiploTres = false;
    private booleano multiploCinco = false;

    @Override
    public void print(int from, int to) {
        
        for (int i = from; i <= to; i++) {
            // Ver si son multiplos
            multiploTres = isMultiplo(i,3);
            multiploCinco = isMultiplo(i,5);

            // Comprobar que se debe imprimir
            if (multiplocinco || multiploTres) {
                System.out.println((multiploCinco ? "Fizz" : "") + (multiploCinco ? "Buzz" : ""));
            } else {
                System.out.println(i);
            }
        }
    }

    // Separar la responsabilidad 
    public static boolean isMultiplo(int number, int base){
        if ((number % base) != 0) {
            return false;
        } else {
            return true;
        }
    }
}
