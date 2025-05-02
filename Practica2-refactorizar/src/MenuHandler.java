import java.util.Scanner;

public class MenuHandler {
    private Scanner scanner;

    public MenuHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        System.out.println("--- MENÚ PRINCIPAL ---");
        System.out.println("1. Registrar libro");
        System.out.println("2. Registrar usuario");
        System.out.println("3. Prestar libro");
        System.out.println("4. Devolver libro");
        System.out.println("5. Buscar libros");
        System.out.println("6. Mostrar libros");
        System.out.println("7. Mostrar usuarios");
        System.out.println("8. Mostrar préstamos activos");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1 -> BibliotecaApp.registrarLibro();
            case 2 -> BibliotecaApp.registrarUsuario();
            case 3 -> BibliotecaApp.prestarLibro();
            case 4 -> BibliotecaApp.devolverLibro();
            case 5 -> BibliotecaApp.buscarLibros();
            case 6 -> BibliotecaApp.mostrarLibros();
            case 7 -> BibliotecaApp.mostrarUsuarios();
            case 8 -> BibliotecaApp.mostrarPrestamosActivos();
            case 9 -> System.out.println("Saliendo del sistema...");
            default -> System.out.println("Opción no válida.");
        }
    }
}
