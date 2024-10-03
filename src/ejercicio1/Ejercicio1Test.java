package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio1Test {

	@ParameterizedTest
	@MethodSource("testStream")
	void testEsVocal(char caracter, boolean resEsperado) {
		boolean resObtenido = Ejercicio1.esVocal(caracter);
		assertEquals(resEsperado, resObtenido);
		
	}
	
	private static Stream<Arguments> testStream() {
		return Stream.of(Arguments.of('a', true),
					Arguments.of('A', true),
					Arguments.of('e', true),
					Arguments.of('E', true),
					Arguments.of('i', true),
					Arguments.of('I', true),
					Arguments.of('o', true),
					Arguments.of('O', true),
					Arguments.of('u', true),
					Arguments.of('U', true),
					Arguments.of('C', false)
				);
	}
	
	@Test
	void testEsVocalAMinuscula() {
		boolean res = Ejercicio1.esVocal('a');
		assertTrue(res);
	}

	@Test
	void testEsVocalAMayuscula() {
		boolean res = Ejercicio1.esVocal('A');
		assertTrue(res);
	}

	@Test
	void testEsVocalEMinuscula() {
		boolean res = Ejercicio1.esVocal('e');
		assertTrue(res);
	}

	@Test
	void testEsVocalEMayuscula() {
		boolean res = Ejercicio1.esVocal('E');
		assertTrue(res);
	}

	@Test
	void testEsVocalIMinuscula() {
		boolean res = Ejercicio1.esVocal('i');
		assertTrue(res);
	}

	@Test
	void testEsVocalIMayuscula() {
		boolean res = Ejercicio1.esVocal('I');
		assertTrue(res);
	}

	@Test
	void testEsVocalOMinuscula() {
		boolean res = Ejercicio1.esVocal('o');
		assertTrue(res);
	}

	@Test
	void testEsVocalOMayuscula() {
		boolean res = Ejercicio1.esVocal('O');
		assertTrue(res);
	}

	@Test
	void testEsVocalUMinuscula() {
		boolean res = Ejercicio1.esVocal('u');
		assertTrue(res);
	}

	@Test
	void testEsVocalUMayuscula() {
		boolean res = Ejercicio1.esVocal('U');
		assertTrue(res);
	}

	@Test
	void testEsVocalConsonante() {
		boolean res = Ejercicio1.esVocal('m');
		assertFalse(res);
	}

}
