package ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio10Test {

	@Test
	void test1EsPalindromo() {
		boolean res = Ejercicio10.esPalindromo("");
		assertFalse(res);
	}
	
	@Test
	void test2EsPalindromo() {
		boolean res = Ejercicio10.esPalindromo("a");
		assertTrue(res);
	}
	
	@Test
	void test3EsPalindromo() {
		boolean res = Ejercicio10.esPalindromo("SEES");
		assertTrue(res);
	}
	
	@Test
	void test4EsPalindromo() {
		boolean res = Ejercicio10.esPalindromo("Erre");
		assertTrue(res);
	}

}
