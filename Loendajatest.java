import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Loendajatest{
  Loendaja kysiLoendaja(){
    return new LihtneLoendaja();
  }
  @Test
  public void tyhjus(){
    Loendaja uuritav=kysiLoendaja();
    assertEquals(0, uuritav.kogus());
  }
  @Test
  public void loendaYks(){
    Loendaja uuritav=kysiLoendaja();
    uuritav.loenda();
    assertEquals(1, uuritav.kogus());
  }
}
