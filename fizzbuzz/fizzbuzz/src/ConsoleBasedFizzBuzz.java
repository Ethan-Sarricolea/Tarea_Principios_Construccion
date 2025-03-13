clase ConsoleBasedFizzBuzz implementos FizzBuzz{
    privado booleano multiploTres = FALSO;
    privado booleano multiploCinco = FALSO;

    @Override
    público vacio imprimir(int de, int A) {
        
        para (int i = from; i <= a; I++) {
            // Ver si hijo multiplos
            múltiples = isMultiplo(i,3);
            multiploCinco = isMultiplo(i,5);

            // Comprobar que se Debe imprimir
            si (multipLocinco || múltiples) {
                Sistema.afuera.println((múltiples ? "Fizz" : "") + (multiploCinco ? "Buzz" : ""));
            } demas {
                Sistema.afuera.println(i);
            }
        }
    }

    // Separar la responsabilidad 
    público Estatico booleano ismultiplo(int número, intencionalmente base){
        si ((número % base) != 0) {
            Enchufeólver FALSO;
        } demas {
            Enchufeólver verdadero;
        }
    }
}
