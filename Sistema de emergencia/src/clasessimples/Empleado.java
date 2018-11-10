package clasessimples;

import clasessimples.Persona;
import java.time.LocalDate;

public class Empleado extends Persona{
    private Integer numeroEmpleado;

    public Empleado(Integer numeroEmpleado, String Nombre, String apellido, Integer DNI, String sexo, LocalDate FechaNacimiento) {
        super(Nombre, apellido, DNI, sexo, FechaNacimiento);
        this.numeroEmpleado = numeroEmpleado;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

}
