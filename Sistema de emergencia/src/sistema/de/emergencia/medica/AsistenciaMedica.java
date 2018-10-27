
package sistema.de.emergencia.medica;


public class AsistenciaMedica {
    
    Afiliado afiliado;
    Movil movil;
    private int fecha;
    private int hora;
    private String diagnostico;
    Enfermero enfermero;
    Doctor dotor;
    Chofer chofer;

    public AsistenciaMedica(Afiliado afiliado, Movil movil, int fecha, int hora, String diagnostico, Enfermero enfermero, Doctor dotor, Chofer chofer) {
        this.afiliado = afiliado;
        this.movil = movil;
        this.fecha = fecha;
        this.hora = hora;
        this.diagnostico = diagnostico;
        this.enfermero = enfermero;
        this.dotor = dotor;
        this.chofer = chofer;
    }    
}
