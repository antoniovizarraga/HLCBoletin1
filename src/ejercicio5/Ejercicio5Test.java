package ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio5Test {

	@Test
	void test1EsCapicua() {
		boolean res = Ejercicio5.esCapicua(1);
		assertTrue(res);
	}
	
	@Test
	void test2EsCapicua() {
		boolean res = Ejercicio5.esCapicua(2);
		assertTrue(res);
	}
	
	@Test
	void test3EsCapicua() {
		boolean res = Ejercicio5.esCapicua(10);
		assertFalse(res);
	}
	
	@Test
	void test4EsCapicua() {
		boolean res = Ejercicio5.esCapicua(11);
		assertTrue(res);
	}
	
	@Test
	void test5EsCapicua() {
		boolean res = Ejercicio5.esCapicua(22);
		assertTrue(res);
	}
	
	@Test
	void test6EsCapicua() {
		boolean res = Ejercicio5.esCapicua(100);
		assertFalse(res);
	}
	
	@Test
	void test7EsCapicua() {
		boolean res = Ejercicio5.esCapicua(101);
		assertTrue(res);
	}
	
	@Test
	void test8EsCapicua() {
		boolean res = Ejercicio5.esCapicua(103);
		assertFalse(res);
	}
	
	@Test
	void test9EsCapicua() {
		boolean res = Ejercicio5.esCapicua(111);
		assertTrue(res);
	}
	
	@Test
	void test10EsCapicua() {
		boolean res = Ejercicio5.esCapicua(998);
		assertFalse(res);
	}
	
	@Test
	void test11EsCapicua() {
		boolean res = Ejercicio5.esCapicua(242);
		assertTrue(res);
	}
	
	@Test
	void test12EsCapicua() {
		boolean res = Ejercicio5.esCapicua(1010);
		assertFalse(res);
	}
	
	@Test
	void test13EsCapicua() {
		boolean res = Ejercicio5.esCapicua(2442);
		assertTrue(res);
	}

}
