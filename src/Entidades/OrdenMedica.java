
package Entidades;

import java.util.ArrayList;
import java.util.List;

public class OrdenMedica {
    Medico medico;
    Paciente paciente;
    List<Medicamento> medicamentos =  new ArrayList();
    Fecha fecha;
    ObraSocial obraSocial;

    public OrdenMedica(Medico medico, Paciente paciente, Fecha fecha, ObraSocial obraSocial) {
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
        this.obraSocial = obraSocial;
    }

    public OrdenMedica() {
        
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
    
    public void agregar(Medicamento m){
    medicamentos.add(m);
    }
    public void mostrarMedi(){
    for(Medicamento m:medicamentos){
        System.out.printf("Medicamento: %s Descripcion: %s\n", m.getNombre(),
                m.getDescripcion());
    
    }
    
    }
    public void mostrar(){
        System.out.printf("Orden Medica:  Fecha: %d/%d/%d \n", getFecha().getDia(),
                getFecha().getMes(), getFecha().getAño());
        System.out.printf("Medico: %s\n", getMedico());
        System.out.printf("Paciente: %s\n", getPaciente());
        mostrarMedi();
        
        
                
              
    }
}
