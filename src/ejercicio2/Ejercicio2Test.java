package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	void testEsPar() {
		boolean res = Ejercicio2.esPar(2);
		assertTrue(res);
	}
	
	 @Test
	void testCeroEsPar() {
		boolean res = Ejercicio2.esPar(0);
		assertTrue(res);
	}
	 
	@Test
	void testEsImpar() {
		boolean res = Ejercicio2.esPar(1);
		assertFalse(res);
	}
	
	@Test
	void testTresEsImpar() {
		boolean res = Ejercicio2.esPar(3);
		assertFalse(res);
	}
	
	@Test
	void testNegativoEsPar() {
		boolean res = Ejercicio2.esPar(-2);
		assertTrue(res);
	}
	
	@Test
	void testNegativoEsImpar() {
		boolean res = Ejercicio2.esPar(-3);
		assertFalse(res);
	}

}
