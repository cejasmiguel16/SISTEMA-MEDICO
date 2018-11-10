
package EmergenciaMedica;

import clasessimples.Afiliado;
import clasesgestoras.GestionHospital;
import interfazGrafica.Principal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class SistemaEmergenciaMedica {

    
    public static void main(String[] args) {
        //LocalDate fecha1= LocalDate.of(2017, 5, 15);
        //LocalDate fecha2= LocalDate.of(2017, 5 ,17);
        //ChronoUnit.DAYS.between(fecha1, fecha2);
        GestionHospital gh= new GestionHospital();
        Principal ventanaPrincipal= new Principal(gh);
    
    }

}