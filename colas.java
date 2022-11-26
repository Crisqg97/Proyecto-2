/**
 *
 * @author Cristel Quesada
 */
public class colas {
    package colas;



public class Clasecola {
    
   
    private static final int MAXTAM = 10; 
    private static int inicio;
    private static int ultimo;
    private final int []cola;
    
 public Clasecola()
 {
    inicio = 0;
    ultimo = -1;
    cola = new int [MAXTAM];
 }   
 
 public void insertar(int elemento)throws Exception
 {
     if (!Colallena())
         cola[++ultimo] = elemento;
    else
         throw new Exception("LA COLA YA ESTA LLENA");
 }
 
  public int eliminar()throws Exception
 {
     if (!ColaVacia())
       return cola[inicio++];
    else
      throw new Exception("LA COLA NO TIENE DATOS");
 }

  public void Borrartodo()
  {
     inicio = 0;
     ultimo = -1;
  }
  
  public int frente() throws Exception
  {
      if (!ColaVacia()) 
          return cola[inicio];
      else
     throw new Exception("LA COLA NO TIENE DATOS");
  }
  
  
 public boolean Colallena()
 {
   return ultimo == MAXTAM - 1;
 }
 
 public boolean ColaVacia()
 {
   return inicio > ultimo;
 }
}
}
