
package consultorio;

import Entidades.Fecha;
import Entidades.Medicamento;
import Entidades.Medico;
import Entidades.ObraSocial;
import Entidades.OrdenMedica;
import Entidades.Paciente;

public class Consultorio {

    public static void main(String[] args) {
        ObraSocial ob = new ObraSocial("Prensa", "A");
        ObraSocial ob1 = new ObraSocial("Prensa", "B");
        Paciente p = new Paciente(ob, 37997477, "Jorge Lopez");
        Medico m = new Medico(45677, 11880058, "Enzo Lescano");
        Fecha f = new Fecha(12, 03, 2016);
        Medicamento md = new Medicamento ("Novalgina", "Una cada 12hs/3dias");
        Medicamento md1 = new Medicamento ("Ibuprofeno", "Uno cada 8hs/1semana");
        
        OrdenMedica om = new OrdenMedica(m,p,f,ob);
        om.agregar(md);
        om.agregar(md1);
        om.mostrar();

    }
    
}
