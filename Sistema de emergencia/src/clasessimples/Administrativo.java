package clasessimples;

import java.time.LocalDate;

public class Administrativo extends Empleado{
 
    public Administrativo(Integer numeroEmpleado, String nombre, String apellido, Integer DNI, String sexo, LocalDate fechaNacimiento) {
        super(numeroEmpleado, nombre, apellido, DNI, sexo, fechaNacimiento);
    }
 
    
}
