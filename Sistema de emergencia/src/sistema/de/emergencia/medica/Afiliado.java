package sistema.de.emergencia.medica;

/**
 *
 * @author FRANCO
 */
public class Afiliado extends Persona{
    private Integer numeroAfiliado;

    public Afiliado(Integer numeroAfiliado, String Nombre, String apellido, Integer DNI, String sexo, int FechaNacimiento) {
        super(Nombre, apellido, DNI, sexo, FechaNacimiento);
        this.numeroAfiliado = numeroAfiliado;
    }

    public Integer getNumeroAfiliado() {
        return numeroAfiliado;
    }

    public void setNumeroAfiliado(Integer numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }   
}
