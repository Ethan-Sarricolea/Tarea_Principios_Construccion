package act1.src;

public class Futbolista extends Personal {
    private String apellido;
    private int numeroJugador;
    private String posicionEnCancha;

    public Futbolista(int id, int nombre, String apellido, int edad, int num, String posicion) {
        super(id, nombre, edad);
        this.apellido = apellido;
        this.numeroJugador = num;
        this.posicionEnCancha = posicion;
    }
    
    // 6.1 Siempre utilizar marcado (override)
    @Override
    public void concentrarse() {
        throw new UnsupportedOperationException("Unimplemented method 'concentrarse'");
    }

    @Override
    public void viajar() {
        throw new UnsupportedOperationException("Unimplemented method 'viajar'");
    }
    
}
