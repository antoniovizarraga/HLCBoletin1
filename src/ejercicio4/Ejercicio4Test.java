package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio4Test {

	@Test
	void testSieteEsPrimo() {
		boolean res = Ejercicio4.esPrimo(7);
		assertTrue(res);
	}
	
	@Test
	void testOchoNoEsPrimo() {
		boolean res = Ejercicio4.esPrimo(8);
		assertFalse(res);
	}
	
	

}
