
package sistema.de.emergencia.medica;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class SistemaEmergenciaMedica {

    
    public static void main(String[] args) {
        LocalDate fecha1= LocalDate.of(2017, 5, 15);
        //LocalDate fecha2= LocalDate.of(2017, 5 ,17);
        //Period periodo = Period.between(fecha2, fecha1);
        //ChronoUnit.DAYS.between(fecha1, fecha2);
        GestionHospital gh= new GestionHospital();
        Afiliado afiliado = new Afiliado(13333, "Miguel", "Cejas", 40724994, "masculino", 13, fecha1);
        //System.out.println(ChronoUnit.DAYS.between(fecha1, fecha2));
        gh.verificarAbonoAfiliado(afiliado);
    
    }

}