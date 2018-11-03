package sistema.de.emergencia.medica;

public class Doctor extends Empleado{
    private Integer disponibilidad;
    
    public Doctor(Integer numeroEmpleado, String Nombre, String apellido, Integer DNI, String sexo, int FechaNacimiento) {
        super(numeroEmpleado, Nombre, apellido, DNI, sexo, FechaNacimiento);
        disponibilidad = 0;
    }

    public Integer getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Integer disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
