/**
 * Autor: Ethan Yahel Sarricolea Cortés
 * Fecha: 13/02/2025
 * Descripción: Codigo de Clase "Entrenador" como sujeto para
 *    Almacenar su información
*/

package act1.src;

public class Entrenador extends Personal {
    // 5.2.5 Nombres de atributos en camelCase 
    private int idFederacion;

    public Entrenador(int identificador, String nombre, String apellido, int edad, int idFederacion) {
            super(identificador, nombre, edad, apellido);
            this.idFederacion = idFederacion;
        }
    
    public void dirigirEntrenamiento(){
        System.out.println(nombre + "dirige el entrenamiento ");
    }

    public void dirigirPartido(){
        System.out.println(nombre + "dirige el partido");
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + "se concentra");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + "Viaja junto a su equipo");
    }

    @Override
    public String toString(){
        return ("[" + identificador +"] - F[" + idFederacion + "] - "
                + nombre + " " + apellido + " - Edad: " + edad);
    }
    
}
