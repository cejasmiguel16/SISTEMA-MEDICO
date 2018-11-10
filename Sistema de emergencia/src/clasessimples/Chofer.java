package clasessimples;

import java.time.LocalDate;

public class Chofer extends Empleado{
    
    public Chofer(Integer numeroEmpleado, String nombre, String apellido, Integer DNI, String sexo, LocalDate fechaNacimiento) {
        super(numeroEmpleado, nombre, apellido, DNI, sexo, fechaNacimiento);
    }
    
}
