/**
 *
 * @author Cristel Quesada 
 */
public class sistemacola {
    package sistemacola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Colasupi {

   static int opcion  = 0;
   static int elemento = 0;
    public static void main(String[] args) {
      Clasecola cola = new Clasecola();
      Clasecola cajero1 = new Clasecola();
      Clasecola cajero2 = new Clasecola();
      Clasecola cajero3 = new Clasecola();
      Clasecola cajero4 = new Clasecola();
      BufferedReader leer = new BufferedReader
        (new InputStreamReader(System.in));      
      
        do {
          try {
              System.out.println("**** Escoja un elemento ****");
              System.out.println("1- Ingrese sus datos");
              System.out.println("2- Borrar datos");
              System.out.println("3- Ver si la cola esta libre");
              System.out.println("4- mostrar el inicio de la cola");
              System.out.println("5- Eliminar todo");
              System.out.println("6- Ver si la cola esta llena");
              System.out.println("7- Salir");
              opcion = Integer.parseInt(leer.readLine());
              
              if (opcion==1) {
                  if (cola.Colallena()) {
                      System.out.println("COLA ESTA LLENA, ERROR AL INICIAR");
                  } else
                  {
                      System.err.print("Escoja una opcion : ");
                      elemento = Integer.parseInt(leer.readLine());
                      try {
                          cola.insertar(elemento);
                      } catch (Exception ex) {
                          Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
              }
          } catch (IOException ex) {
              Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
          }
            
            if (opcion==2) {
                if (cola.ColaVacia()) {
                    System.err.println("LA COLA ESTA VACIA NO PUEDE ELIMINAR ELEMENTOS");
                } else
                {   try {
                    System.out.println(cola.eliminar());
                    } catch (Exception ex) {
                        Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            if (opcion==3) {
                if (cola.ColaVacia()) 
                    System.err.println("LA COLA ESTA VACIA");
                 else
                    System.err.println("LA COLA NO ESTA VACIA");
            }
            
            if (opcion == 4) {
                if (cola.ColaVacia()) {
                    System.err.println("LA COLA ESTA VACIA");
                } else
                {
                    try {
                        System.out.println("El inicio es: " + cola.inicio());
                    } catch (Exception ex) {
                        Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            if (opcion == 5) {
                cola.Borrartodo();
            }
            
            if (opcion == 6) {
                if (cola.Colallena())
                    System.err.println("LA COLA ESTA LLENA");
                   else
                    System.err.println("LA COLA NO ESTA LLENA");
            }
            
        } while (opcion!=7);

    }

}
}
