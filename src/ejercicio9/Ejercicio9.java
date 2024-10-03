package ejercicio9;

public class Ejercicio9 {
	
	/**
	 * Función que dado un valor como parámetro, te devuelve el valor en binario de dicho parámetro.
	 * @param valorDecimal El valor decimal que transformaremos en binario. No hay ninguna condición de entrada.
	 * @return Devuelve un entero (Int) representando el valor en binario.
	 */
	public static int binario(int valorDecimal) {
		int res = 0;
		
		/* Creamos una cadena de forma temporal para utilizar la función
		 * toBinaryString que transforma cualquier valor que sea válido
		 * en un valor binario. */
		String temp = Integer.toBinaryString(valorDecimal);
		
		// Pasamos el valor de la cadena a un entero.
		res = Integer.valueOf(temp);
		
		return res;
	}
}
