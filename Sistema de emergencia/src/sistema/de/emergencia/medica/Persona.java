package sistema.de.emergencia.medica;


/**
 *
 * @author FRANCO
 */
public class Persona {
    private String Nombre;
    private String apellido;
    private Integer DNI;
    private String sexo;
    private int FechaNacimiento;

    public Persona(String Nombre, String apellido, Integer DNI, String sexo, int FechaNacimiento) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.sexo = sexo;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
 
    
    
    
}
