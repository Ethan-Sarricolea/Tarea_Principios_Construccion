/**
 * Autor: @Ethan-Sarricolea
 * Fecha: 13/02/2025
 * Descipcion: Codigo de clase de personal "Masajista" para el guardado
 *    de su informacion 
 */

package act1.src;

public class Masajista extends Personal {
    private String profesion;
    private int aniosExperiencia;

    public Masajista(int identificador, String nombre, int edad, String apellido, String profesion, int experiencia) {
            super(identificador, nombre, edad, apellido);
            this.profesion = profesion;
            this.aniosExperiencia = experiencia;
        }
    
    public void darMasaje(){
        System.out.println(nombre + " da masaje a los jugadores");
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " se concentra en su trabajo");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + " viaja con el equipo");
    }
    
    @Override
    public String toString(){
        return ("[" + identificador + "] - " + nombre + " " + apellido
                + " " + edad + " años - " + profesion + " - "
                + aniosExperiencia + " años de experiencia");
    }
}
