package anobissesto.test;

import static org.junit.Assert.*;
import org.junit.Test;
import anobissesto.Bissesto;

public class TesteAnoBissesto {
  @Test
  public void deveRetornarAnoBissexto() {
    Bissesto anoBissexto = new  Bissesto();

      assertEquals(true, anoBissexto.isAnoBissexto(2016));
      assertEquals(true, anoBissexto.isAnoBissexto(2012));
  }

  @Test
  public void naoDeveRetornarAnoBissexto() {
      Bissesto anoBissexto = new  Bissesto();

      assertEquals(false, anoBissexto.isAnoBissexto(2015));
      assertEquals(false, anoBissexto.isAnoBissexto(2011));
  }

}
