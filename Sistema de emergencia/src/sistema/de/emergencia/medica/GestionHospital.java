package sistema.de.emergencia.medica;

import java.util.ArrayList;

public class GestionHospital {
          private ArrayList<Persona> personas;
          private ArrayList<Movil> moviles;

          public Afiliado buscarAfiliado(Integer dni){
              for(Persona i: personas){
                  if(i instanceof Afiliado){
                      Afiliado a= (Afiliado)i;
                      if(a.getDNI()==dni){
                          return a;
                      }
                  }
              }
          return null;
          }
          
           public Afiliado buscarChofer(Integer dni){
              for(Persona i: personas){
                  if(i instanceof Afiliado){
                      Afiliado a= (Afiliado)i;
                      if(a.getDNI()==dni){
                          return a;
                      }
                  }
              }
          return null;
          }
           
          public Doctor buscarDoctor(Integer dni){
              for(Persona i: personas){
                  if(i instanceof Doctor){
                      Doctor a= (Doctor)i;
                      if(a.getDNI()==dni){
                          return a;
                      }
                  }
              }
          return null;
          } 
}
