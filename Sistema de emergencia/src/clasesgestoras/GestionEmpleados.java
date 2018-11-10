package clasesgestoras;

import clasessimples.Chofer;
import clasessimples.Doctor;
import clasessimples.Empleado;
import clasessimples.Enfermero;
import clasessimples.Movil;
import java.util.ArrayList;

public class GestionEmpleados {
          private ArrayList<Empleado> empleados;
          private ArrayList<Movil> moviles;
          
          public void altaDoctor(Doctor doctor){
              empleados.add(doctor);
          } 
          
          public void altaEnfermero(Enfermero enfermero){
              empleados.add(enfermero);
          } 
          
          public void AltaMovil(Movil movil){
              moviles.add(movil);
          }
          
          public void altaChofer(Chofer chofer){
              empleados.add(chofer);
          }
          
          public void bajaChofer(Chofer chofer){
              empleados.remove(chofer);
          }
          
          
          public void bajaDoctor(Doctor doctor){
              empleados.remove(doctor);
          }
          
          public void bajaEnfermero(Enfermero enfermero){
              empleados.remove(enfermero);
          }
          
          public void bajaMovil(Movil movil){
              moviles.remove(movil);
          }
          
          public Doctor buscarDoctor(){
              Doctor b = null;
              for(Empleado i: empleados){
                  if(i instanceof Doctor){
                      Doctor a= (Doctor)i;
                      if(a.getDisponibilidad()==0){
                            //DOCTOR ENCONTRADO
                            b = a;
                            break;
                      }
                  }
              }
          return b;    
          }
}
