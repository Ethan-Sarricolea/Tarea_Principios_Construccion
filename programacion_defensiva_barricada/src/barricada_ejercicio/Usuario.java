package barricada_ejercicio;

// Clase usuario zona segura
public class Usuario {
    String correo;
    String contrasena;
    int edad;

    // implementar constructor: Usuario(String correo, String contrasena, int edad)
    public Usuario(String correo, String contrasena, int edad) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    // implementar método: mostrarInfo()
    public void mostrarInfo() {
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña: " + contrasena);
        System.out.println("Edad: " + edad);
    }
    
}
