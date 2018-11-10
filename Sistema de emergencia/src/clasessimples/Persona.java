package clasessimples;

import java.time.LocalDate;


/**
 *
 * @author Miguel
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer DNI;
    private String sexo;
    private LocalDate fechaNacimiento;

    public Persona(String Nombre, String apellido, Integer DNI, String sexo, LocalDate FechaNacimiento) {
        this.nombre = Nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.sexo = sexo;
        this.fechaNacimiento = FechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
 
    
    
    
}
