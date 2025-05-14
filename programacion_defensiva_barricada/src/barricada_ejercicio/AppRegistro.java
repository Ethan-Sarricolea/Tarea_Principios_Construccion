package barricada_ejercicio;

import java.util.Scanner;

public class AppRegistro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leer correo, contraseña y edad
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su correo: ");
        String entradaCorreo = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String entradaContrasena = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        String entradaEdad = scanner.nextLine();
        scanner.close();

        // Validación (barricada)
        String correo = ValidadorUsuario.validarCorreo(entradaCorreo);
        String contrasena = ValidadorUsuario.validarContrasena(entradaContrasena);
        Integer edad = ValidadorUsuario.validarEdad(entradaEdad);

        // Guardar datos en objeto usuario en caso que todos los datos sean válidos
        // de lo contrario indicar mensaje de error

        System.out.println("------------------");

        if (correo == null) {
            System.out.println("Error en el correo. Verifique el formato.");
        } if (contrasena == null) {
            System.out.println("Error en la contraseña. Debe tener al menos 9 caracteres y no contener espacios ni caracteres especiales.");
        } if (edad == null) {
            System.out.println("Error en la edad. Debe ser un número entre 15 y 50.");
        } else if (correo != null && contrasena != null) {
            Usuario usuario = new Usuario(correo, contrasena, edad);
            System.out.println("Registro exitoso:");
            usuario.mostrarInfo();
        }
    }
}
