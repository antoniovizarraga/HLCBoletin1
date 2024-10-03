package ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio9Test {

	@Test
	void test1Binario() {
		int res = Ejercicio9.binario(1);
		assertEquals(1, res);
	}
	
	@Test
	void test2Binario() {
		int res = Ejercicio9.binario(2);
		assertEquals(10, res);
	}
	
	@Test
	void test3Binario() {
		int res = Ejercicio9.binario(404);
		assertEquals(110010100, res);
	}
	
	@Test
	void test4Binario() {
		int res = Ejercicio9.binario(25);
		assertEquals(11001, res);
	}
	
	@Test
	void test5Binario() {
		int res = Ejercicio9.binario(1000);
		assertEquals(1111101000, res);
	}
	
	@Test
	void test6Binario() {
		int res = Ejercicio9.binario(0);
		assertEquals(0, res);
	}

}
