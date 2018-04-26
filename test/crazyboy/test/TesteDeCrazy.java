package crazyboy.test;
import static org.junit.Assert.*;
import org.junit.Test;
import crazyboy.*;
public class TesteDeCrazy {

  Crazy c =new Crazy(10);

  @Test
  public void testasoma(){
      assertEquals("deve retornar 12",12,c.soma(2));
  }
  @Test
  public void testassub(){
      assertEquals("deve retornar 12",8,c.sub(2));
  }
  @Test
  public void testadiv(){
      assertEquals("deve retornar 12",5,c.div(2));
  }
  @Test
  public void testamult(){
      assertEquals("deve retornar 12",20,c.mult(2));
  }
}
