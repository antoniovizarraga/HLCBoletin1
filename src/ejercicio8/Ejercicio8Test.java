package ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio8Test {

	@Test
	void test1Fibonacci() throws FibonacciZeroException {
		int res = Ejercicio8.fibonacci(1);
		assertEquals(1, res);
	}
	
	@Test
	void test2Fibonacci() {
		try {
			int res = Ejercicio8.fibonacci(0);
			fail("Prueba fallada: Debería lanzar una excepción al introducir el valor 0 o inferior a 0.");
		} catch (FibonacciZeroException e) {
			// Prueba satisfactoria
		}
		
	}
	
	@Test
	void test3Fibonacci() throws FibonacciZeroException {
		int res = Ejercicio8.fibonacci(2);
		assertEquals(1, res);
	}
	
	@Test
	void test4Fibonacci() throws FibonacciZeroException {
		int res = Ejercicio8.fibonacci(3);
		assertEquals(2, res);
	}
	
	@Test
	void test5Fibonacci() throws FibonacciZeroException {
		int res = Ejercicio8.fibonacci(4);
		assertEquals(3, res);
	}
	
	@Test
	void test6Fibonacci() throws FibonacciZeroException {
		int res = Ejercicio8.fibonacci(5);
		assertEquals(5, res);
	}
	
	@Test
	void test7Fibonacci() throws FibonacciZeroException {
		int res = Ejercicio8.fibonacci(6);
		assertEquals(8, res);
	}
	
	@Test
	void test8Fibonacci() throws FibonacciZeroException {
		int res = Ejercicio8.fibonacci(7);
		assertEquals(13, res);
	}
	
	@Test
	void test9Fibonacci() throws FibonacciZeroException {
		int res = Ejercicio8.fibonacci(8);
		assertEquals(21, res);
	}

}
