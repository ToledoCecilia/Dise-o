
package Entidades;

public class Paciente extends Persona {
    ObraSocial obraSocial;

    public Paciente(int dni, String nombre) {
        super(dni, nombre);
    }

    public Paciente(ObraSocial obraSocial, int dni, String nombre) {
        super(dni, nombre);
        this.obraSocial = obraSocial;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
    
}
