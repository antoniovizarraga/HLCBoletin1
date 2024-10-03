package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio3Test {

	@Test
	void testAbejaFizz() {
		String res = Ejercicio3.abeja(27);
		assertEquals("fizz", res);
	}
	
	@Test
	void testAbejaFizzbuzz() {
		String res = Ejercicio3.abeja(15);
		assertEquals("fizzbuzz", res);
	}
	
	@Test
	void testAbejaBuzz() {
		String res = Ejercicio3.abeja(995);
		assertEquals("buzz", res);
	}

}
