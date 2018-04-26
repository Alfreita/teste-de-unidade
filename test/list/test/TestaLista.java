package list.test;

import static org.junit.Assert.*;
import org.junit.Test;
import list.Lista;

public class TestaLista {


  @Test
  public void deveEncontrarONumeroDeElementosDaLista(){
      Lista l=new Lista();
      l.setLisa(8222);
      l.setLisa(3);
      l.setLisa(1201);
      l.setLisa(435);
      int a=l.maior();
      int b=l.menor();
      assertEquals("tem que set 8222",8222,a);
      assertEquals("o menor ",3,b);
  }
}
