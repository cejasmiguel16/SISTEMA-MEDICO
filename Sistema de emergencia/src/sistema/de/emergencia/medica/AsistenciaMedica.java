
package sistema.de.emergencia.medica;

import java.time.LocalDate;


public class AsistenciaMedica {
    
    Afiliado afiliado;
    Movil movil;
    private LocalDate fecha;
    //private LocalDate hora;
    private String diagnostico;
    Enfermero enfermero;
    Doctor dotor;
    Chofer chofer;

    public AsistenciaMedica(Afiliado afiliado, Movil movil, LocalDate fecha, String diagnostico, Enfermero enfermero, Doctor dotor, Chofer chofer) {
        this.afiliado = afiliado;
        this.movil = movil;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.enfermero = enfermero;
        this.dotor = dotor;
        this.chofer = chofer;
    }    
}
