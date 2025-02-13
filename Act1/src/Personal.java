/**
 * Autor: Ethan Yahel Sarricolea Cortés
 * Fecha: 12/02/2025
 * Descripción: Codigo abstracto de persona para los registros
 */

package act1.src;

public abstract class Personal {
    // 4.4 Los atributos deben ser privados
    /* 4.6.1 Los atributos se declaran al inicio de la clase, antes
     *     de los constructores y métodos.
    */
    
    protected int identificador;
    protected String nombre;
    protected String apellido;
    protected int edad;

    /* 4.8.2 Inicializar los atributos en el constructor o
     *     directamente en la declaración si constante
    */
    public Personal(int identificador, String nombre, int edad, String apellido) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    // 5.2.3 Los nombres de los metodos se escriben en lowerCamelCase
    public abstract void concentrarse();

    public abstract void viajar();
}
