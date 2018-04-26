package filtro.test;

import static org.junit.Assert.*;
import org.junit.Test;
import filtro.Listafiltro;


public class TestaFiltro {

  Listafiltro lf =new Listafiltro();

  @Test
  public void verifica(){
    lf.setFiltro(124);

    assertEquals("number 124 should be in the arraylist",124,lf.recebeInt(124));
  }

  @Test
  public void verifican(){
    lf.setFiltro(123);

    assertEquals("number 124 shouldn´t be in the arraylist",-1,lf.recebeInt(124));
  }
  @Test
  public void verificaTamanho (){
    lf.setFiltro(12);
    lf.setFiltro(12);
    lf.setFiltro(12);
    lf.setFiltro(12);
    lf.setFiltro(12);
    lf.setFiltro(12);

    assertEquals("Should be 6",6,lf.getTamanho());
  }

}
