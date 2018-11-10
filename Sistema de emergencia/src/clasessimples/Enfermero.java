
package clasessimples;

import java.time.LocalDate;

public class Enfermero extends Empleado{
    private Integer disponible;

    public Enfermero(Integer numeroEmpleado, String nombre, String apellido, Integer DNI, String sexo, LocalDate fechaNacimiento) {
        super(numeroEmpleado, nombre, apellido, DNI, sexo, fechaNacimiento);
        disponible= 0;
    }

    public Integer getDisponible() {
        return disponible;
    }

    public void setDisponible(Integer disponible) {
        this.disponible = disponible;
    }

    
}
