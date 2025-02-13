/**
 * Autor: Ethan Yahel Sarricolea Cortés
 * Fecha: 11/02/2025
 * Descripción: Codigo principal para la ejecucion del programa
*/

// 5.2.1 Los nombres de los paquetes usan solo letras en minúsculas y dígitos
package act1.src;

import java.util.ArrayList;
import java.util.Scanner;

// 5.2.2 Nombres de clases en UperCamelCase
public class App {
    private static ArrayList<Personal> lista = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int option;

        // 4.6.3 Usar Javadoc para documentar atributos si no son obvios.
        
        /**
         * Creacion de lista, instancias de cada tipo y su adicion a la lista de registro
         */
        Futbolista jugador1 = new Futbolista(1, "Messi", "Abelardo",
                                                 35, 10, "Delantero");
        Entrenador trainer = new Entrenador(2, "Pedro", "Pascal",
                                                 50, 123);
        Masajista masajista = new Masajista(3, "jose", 30, "Maria",
                                                 "Ingeniero de Software", 5);
        lista.add(trainer);
        lista.add(jugador1);
        lista.add(masajista);

        System.out.println("Administracion de la Seleccion Mexicana");

        do {
            System.out.println("0)Salir 1)Ver Personal 2)Agregar personal");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nFiltrar: 1)Jugadores 2)Entrenadores 3)Masajistas 0)Todos");
                    verPersonal(input.nextInt());
                    break;
                case 2:
                    System.out.println("\n0)Volver 1)Futbolista 2)Entrenador 3)Masajista");
                    agregarPersonal(input.nextInt(), input);
                    break;
                default:
                    break;
            }
            
        } while (option>0);
        System.out.println("--Sistema cerrado--");
    }

    public static void verPersonal(int option){
        // Crear un listado de clases que heredan Personal
        ArrayList<Class<? extends Personal>> listado = new ArrayList<>();
        listado.add(Futbolista.class);
        listado.add(Entrenador.class);
        listado.add(Masajista.class);

        // Recorrer la lista de personal y mostrar segun la instruccion
        for (Personal personal : lista) {
            if (option <= 0){
                System.out.println(personal.toString());
            } else if (personal.getClass() == (listado.get(option-1))){
                System.out.println(personal.toString());
            }
        }
        System.out.print("\n");
    }

    // KISS??
    public static void agregarPersonal(int option, Scanner input){
        switch (option) {
            case 1:
                System.out.println("ID, Nombre, Apellido, Edad, Numero, Posicion");
                Futbolista obj1 = new Futbolista(input.nextInt(), input.next(), input.next(),
                                             input.nextInt(), input.nextInt(), input.next());
                lista.add(obj1);
                break;
            case 2:
                System.out.println("Identificador, Nombre, Apellido, Edad, IdFederacion");
                Entrenador obj2 = new Entrenador(input.nextInt(), input.next(), input.next(),
                                         input.nextInt(), input.nextInt());
                lista.add(obj2);
                break;

            case 3:
                System.out.println("Identificador, Nombre, Edad, Apellido, Profesion, AñosDeExperiencia");
                Masajista obj3 = new Masajista(input.nextInt(), input.next(), input.nextInt(),
                                             input.next(), input.next(), input.nextInt());
                lista.add(obj3);
                break;
            default:
                System.out.println("-- Seleccion no permitida --");
                break;
        }
        System.out.println("Personal agregado");
    }
}