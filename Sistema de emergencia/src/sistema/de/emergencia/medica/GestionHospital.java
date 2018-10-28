package sistema.de.emergencia.medica;

import java.util.ArrayList;

public class GestionHospital {
          private ArrayList<Afiliado> afiliados;
          private ArrayList<AsistenciaMedica> solicitudes;
          
          public GestionHospital(){
              ArrayList<Afiliado> afiliados= new ArrayList<Afiliado>();
          }
          
          public void altaAfiliado(Afiliado afiliado){
              afiliados.add(afiliado);
          }
          
          public void bajaAfiliado(Afiliado afiliado){
              afiliados.remove(afiliado);
          }
          
          public Afiliado buscarAfiliado(Integer dni){
              for(Afiliado i: afiliados){
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
              for(Afiliado i: afiliados){
                  if(i instanceof Afiliado){
                      Afiliado a= (Afiliado)i;
                      if(a.getDNI()==dni){
                          return a;
                      }
                  }
              }
          return null;
          }

}
