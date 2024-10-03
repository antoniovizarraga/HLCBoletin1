package ejercicio8;

public class Ejercicio8 {

	/**
	 * Una función que dado un valor mayor de 0, te devuelve la posición de dicho
	 * valor de la sucesión de Fibonacci. Al darle un valor menor de 1, te da una
	 * FibonacciZeroException.
	 * 
	 * @param val La posición del valor de la sucesión de Fibonacci. Dicha posición
	 *            no puede ser menor a 1. Si es menor de 1, te lanza la excepción:
	 *            "FibonacciZeroException".
	 * @return Te devuelve el valor correspondiente al de la posición pasada por
	 *         parámetro de la sucesión de Fibonacci.
	 * @throws FibonacciZeroException
	 */
	public static int fibonacci(int val) throws FibonacciZeroException {
		// Ponemos los dos valores que usaremos para el cálculo de la sucesión.

		// El primer valor es 1.
		int valorSiguiente = 1;

		// El valor siguiente de la sucesión de Fibonacci es 1 otra vez.
		int resto = 1;

		/*
		 * La idea es ir guardando los dos valores de la sucesión de Fibonacci en sus
		 * correspondientes variables para luego guardar la suma en la variable res.
		 */
		int res = 0;

		/* Si la posición es menor que 1, lanza la excepción. */
		if (val < 1) {
			throw new FibonacciZeroException(
					"Error: No se puede introducir un valor menor que 1 en la sucesión de Fibonacci.");
		} else if (val <= 2) {
			/*
			 * Comprobamos que sea menor o igual que 2 ya que las primeras posiciones
			 * devuelven 1 siempre. Entonces no me sirve de nada hacer el cálculo de la
			 * sucesión de Fibonacci si siempre va a devolver 1, por lo que asignamos 1 y lo
			 * devolvemos para evitar cálculos innecesarios.
			 */
			res = 1;
		} else {
			/*
			 * Hacemos el cálculo de Fibonacci. Empezamos desde 2 porque realmente el
			 * ejercicio pide empezar desde 2, ya que los dos primeros valores dan 0 y 1.
			 * Por lo que para cumplir lo especificado, se empieza desde 2.
			 */
			for (int i = 2; i < val; i++) {
				// Hacemos la suma o el cálculo del siguiente valor en la sucesión de Fibonacci.
				res = (resto + valorSiguiente);

				/*
				 * Actualizamos los valores de suma para que en la siguiente iteración, la suma
				 * dé el resultado correcto.
				 */
				resto = valorSiguiente;
				valorSiguiente = res;
			}
		}

		return res;
	}
}
