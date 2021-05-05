package ejemploEnClases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PruebaTest {

	private Prueba p1;
	
	@Before
	public void Before() {
		this.p1 = new Prueba(7,3);
	}
	@Test
	public void sumaNumeros() {
		assertEquals(10, this.p1.sumaNumeros());
	}
	
	@Test
	public void restaNumeros() {
		assertEquals(4, this.p1.restaNumeros());
	}

}
