
package Entidades;

public class Medico extends Persona {
   
    int matricula;

    public Medico(int matricula, int dni, String nombre) {
        super(dni, nombre);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
}
