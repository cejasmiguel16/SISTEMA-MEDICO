package clasesgestoras;

import clasessimples.Afiliado;
import clasessimples.AsistenciaMedica;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class GestionHospital {
          private ArrayList<Afiliado> afiliados = new ArrayList<>();
          
          public GestionHospital(){
              //ArrayList<Afiliado> afiliados= new ArrayList<Afiliado>();
          }
          
          public void altaAfiliado(Afiliado afiliado){
              afiliados.add(afiliado);
          }
          
          public void bajaAfiliado(Afiliado afiliado){
              afiliados.remove(afiliado);
          }
          
          public Afiliado buscarAfiliado(Integer dni){
              for(Afiliado i: afiliados){
                 // if(i instanceof Afiliado){
                      //Afiliado a= (Afiliado)i;
                      if(i.getDNI()==dni){
                          return i;
                      //}
                  }
              }
          return null;
          }
          
          public void verificarAbonoAfiliado(Afiliado afiliado){
              LocalDate fechaActual= LocalDate.now();
              //Period periodo = Period.between(fechaActual, afiliado.getFechaDePago());
              // LA FUNCION CHRONOUNIT ME DEVUELVE LA CANTIDAD DE DIAS EN TIPO LONG "TENER EN CUENTA A lA HORA DE COMPARAR"
              // EL PERIOD NO ME SIRVIO
              //System.out.println(ChronoUnit.DAYS.between(afiliado.getFechaDePago(), fechaActual));
              if(ChronoUnit.DAYS.between(afiliado.getFechaDePago(), fechaActual)>60){
                    afiliado.setAbonoHabilitado(1);
                    System.out.println("SE ENTRO AL PRIMER IF");
                    //DEBE EL ABONO NO PUEDE SER ATENDIDO
              }
              else{
                    System.out.println("SE ENTRO AL ELSE");
                    //ACCION QUE VA A HACER SI ESTA HABILITADO PARA ATENDERLO CON EL SISTEMA MEDICO                    
              }
          }
          
          
          
          public void pagarAbonoAfiliado(Afiliado afiliado){
              LocalDate fechaActual= LocalDate.now();
              if(ChronoUnit.DAYS.between(afiliado.getFechaDePago(), fechaActual)<60){
                    //NO DEBE PAGAR ABONO, ESTA AL DIA
              }
              else{
                  afiliado.setFechaDePago(fechaActual);
                  afiliado.setAbonoHabilitado(0);
                  //PAGADO
              }
          }
          
          public void mostrarPrimerAfliado(){
             System.out.println("nombre: "+afiliados.get(0).getNombre());
            //for(Afiliado i: afiliados)
              // if(i instanceof Afiliado){
               //Afiliado a= (Afiliado)i;
              //}
          }
}
