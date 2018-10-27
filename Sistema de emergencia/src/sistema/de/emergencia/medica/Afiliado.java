package sistema.de.emergencia.medica;

import java.util.ArrayList;

public class Afiliado extends Persona{
    private Integer numeroAfiliado;
    private ArrayList<Persona> grupoFamiliar;

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

    public ArrayList<Persona> getGrupoFamiliar() {
        return grupoFamiliar;
    }

    public void setGrupoFamiliar(ArrayList<Persona> grupoFamiliar) {
        this.grupoFamiliar = grupoFamiliar;
    }

}
