
package sistema.de.emergencia.medica;

public class ResultadoAsisMedica {
    private String tipoAsistencia;
    private String descrupcion;

    public ResultadoAsisMedica(String tipoAsistencia, String descrupcion) {
        this.tipoAsistencia = tipoAsistencia;
        this.descrupcion = descrupcion;
    }
 
    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(String tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    public String getDescrupcion() {
        return descrupcion;
    }

    public void setDescrupcion(String descrupcion) {
        this.descrupcion = descrupcion;
    }
       
    
    
    
    
    
    public void generarDiagnostico(){
        
        
        
    }

}
