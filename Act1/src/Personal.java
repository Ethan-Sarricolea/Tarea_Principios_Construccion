/**
 * Autor: Ethan Yahel Sarricolea Cortés
 * Fecha: 12/02/2025
 * Descripción: Codigo abstracto de persona para los registros
 */

package act1.src;

public abstract class Personal {
    // 4.4 Los atributos deben ser privados
    private int identificador;
    private int nombre;
    private int edad;

    public Personal(int identificador, int nombre, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
    }

    // 5.2.3 Los nombres de los metodos se escriben en lowerCamelCase
    public abstract void concentrarse();

    public abstract void viajar();
}
