package ejemploEnClases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EjemploTest {
	
	private Ejemplo p1;
	
	@Before
	public void Before() {
		this.p1 = new Ejemplo("pablo");
	}
	
	
	@Test
	public void tamanoFrase() {
		assertEquals(5, this.p1.tamanoFrase());
	}

}
