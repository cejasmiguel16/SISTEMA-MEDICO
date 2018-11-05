
package EmergenciaMedica;

public class Enfermero extends Empleado{
    private Integer disponible;

    public Enfermero(Integer numeroEmpleado, String Nombre, String apellido, Integer DNI, String sexo, int FechaNacimiento) {
        super(numeroEmpleado, Nombre, apellido, DNI, sexo, FechaNacimiento);
        disponible= 0;
    }

    public Integer getDisponible() {
        return disponible;
    }

    public void setDisponible(Integer disponible) {
        this.disponible = disponible;
    }

    
}
