package ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio7Test {

	@Test
	void test1CheckDate() {
		boolean res = Ejercicio7.checkDate(23, 1, 2024);
		assertTrue(res);
	}
	
	@Test
	void test2CheckDate() {
		boolean res = Ejercicio7.checkDate(23, 1, 2023);
		assertTrue(res);
	}
	
	@Test
	void test3CheckDate() {
		boolean res = Ejercicio7.checkDate(28, 2, 2024);
		assertTrue(res);
	}
	
	@Test
	void test4CheckDate() {
		boolean res = Ejercicio7.checkDate(29, 2, 2024);
		assertTrue(res);
	}
	
	@Test
	void test5CheckDate() {
		boolean res = Ejercicio7.checkDate(30, 2, 2024);
		assertFalse(res);
	}
	
	@Test
	void test6CheckDate() {
		boolean res = Ejercicio7.checkDate(1, 3, 2024);
		assertTrue(res);
	}
	
	@Test
	void test7CheckDate() {
		boolean res = Ejercicio7.checkDate(29, 2, 2022);
		assertFalse(res);
	}
	
	@Test
	void test8CheckDate() {
		boolean res = Ejercicio7.checkDate(29, 2, 2012);
		assertTrue(res);
	}

}
