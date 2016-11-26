import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ArvutajaTestid{
	Kalkulaator kysiKalkulaator(){
		//return new Korrutis();
		return new Summa();
	}
	@Test
	public void kaksarvusumma(){
		Kalkulaator uuritav=kysiKalkulaator();
		assertEquals(6,uuritav.vastus(new int[]{3,3}), 0.001);
	}
/*	@Test
	public void kaksarvukorrutis(){
		Kalkulaator uuritav=kysiKalkulaator();
		uuritav.loenda();
		assertEquals(1, uuritav.vastus());
	}*/
}
