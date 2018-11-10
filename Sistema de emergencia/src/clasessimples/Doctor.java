package clasessimples;

import java.time.LocalDate;

public class Doctor extends Empleado{
    private Integer disponibilidad;
    
    public Doctor(Integer numeroEmpleado, String Nombre, String apellido, Integer DNI, String sexo, LocalDate fechaNacimiento) {
        super(numeroEmpleado, Nombre, apellido, DNI, sexo, fechaNacimiento);
        disponibilidad = 0;
    }

    public Integer getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Integer disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
