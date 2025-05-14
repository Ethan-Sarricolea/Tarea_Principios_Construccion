package barricada_ejercicio;

import java.util.regex.Pattern;

// clase barricada
public class ValidadorUsuario {

    // implementar método: validarCorreo(String correo)
    // aceptar emial que contengan @ y .
    public static String validarCorreo(String correo) {
        // Verificar el arroba y dominio (usando el punto)
        if (correo.contains("@") && correo.contains(".")) {
            return correo;
        } else {
            // Si no contiene retorna null como la indicacion dice
            return null;
        }
    }

    // implementar método: validarContrasena(String contrasena)
    // constraseña debe tener longitud mayor o igual a 8
    public static String validarContrasena(String contrasena) {
        String regex = "[<>{}\\[\\]();:'\"`\\\\/|~,=+%$]";

        // Si su longitud es mayor a 9 o menor a 8
        if (contrasena.length() < 9) {
            return null;
        
        // si contiene caracteres invalidos para contraseña
        } else if (Pattern.compile(regex).matcher(contrasena).find()) {
            return null;

        } else {
            // Si cumple se retorna la contraseña
            return contrasena;
        }
    }

    // implementar método: validarEdad(String edadTexto)
    // edad debe ser mayor o gual a 15 y menor o igual a 50
 
    public static Integer validarEdad(String edadTexto) {

        try {
            // Convertir a entero
            int edad = Integer.parseInt(edadTexto);

            // Si la edad es menor a 15 o mayor a 50
            if (edad < 15 || edad > 50) {
                return null;
            } else {
                // Si cumple se retorna la edad
                return edad;
            }
        } catch (NumberFormatException e) {
            return null; // retornar null como valor por defecto
        }
    }
}
