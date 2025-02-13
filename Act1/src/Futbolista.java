/**
 * Autor: Ethan Yahel Sarricolea Cortés
 * Fecha: 13/02/2025
 * Descripción: Codigo de Clase "Futbolista" como sujeto para
 *    Almacenar su información
*/

/* 
7.1.3 Cuando una etiqueta de bloque no cabe en una sola línea, las líneas
   de continuación están sangrados cuatro (o más) espacios desde la posición
*/
package act1.src;

public class Futbolista extends Personal {
    private int numeroJugador;
    private String posicionEnCancha;

    public Futbolista(int id, String nombre, String apellido, int edad, int num, String posicion) {
        super(id, nombre, edad, apellido);
        this.numeroJugador = num;
        this.posicionEnCancha = posicion;
    }
    
    public void jugarPartido(){
        System.out.println(numeroJugador + " forma parte del partido");
    }

    public void entrenar(){
        System.out.println(nombre + " participa en el entrenamiento");
    }

    // 6.1 Siempre utilizar marcado (@override)
    @Override
    public void concentrarse() {
        System.out.println(nombre + "esta concentrandose en el juego");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + "Viaja para el juego");
    }

    @Override
    public String toString(){
        return ("[" + identificador + "] - " + nombre + " " + apellido
        + " - Edad: " + edad + " - Num." + numeroJugador + " - "
        + posicionEnCancha);
    }
    
}
