package ejercicio5;

public class Ejercicio5 {
	
	/**
	 * Función que comprueba si un número pasado por parámetro es capicúa o no, devolviendo true o false dependiendo
	 * de si lo es, o no lo es.
	 * Precondición: Ninguna
	 * Postcondición: Ninguna
	 * @param numero El valor a comprobar si es capicúa o no.
	 * @return res Devuelve un boolean
	 */
	public static boolean esCapicua(int numero) {
		
		// Creamos el valor a devolver. Será true si el valor es capicúa o no.
		boolean res = false;
		
		// Creamos los siguientes campos:
		/* valorActual: Creamos el valor actual que toma como número el pasado por parámetro. Lo hacemos así
		 * porque lo usaremos luego en un algoritmo e iremos iterando sobre el valor.
		 * numInvertido: Será igual que valorActual pero invertido. Ejemplo: Si valorActual es 1234,
		 * numInvertido será 4321.
		 * 
		 * resto: resto es una variable que irá cogiendo valores de derecha a izquierda del valorActual y los
		 * irá guardando en numInvertido. */
		int valorActual = numero;
		int numInvertido = 0;
		int resto = 0;
		
		// Mientras el valor sea positivo y no sea 0,
		while(valorActual > 0) {
			
			// Guarda en el resto la última cifra.
			resto = valorActual % 10;
			
			// En numInvertido, cogemos su valor ya establecido y le añadimos el valor de resto.
			numInvertido = numInvertido * 10 + resto;
			
			// Al valorActual se le quita la cifra que ya ha sido añadida a numInvertido.
			valorActual /= 10;
		}
		
		// Si los dos números coinciden, es que son capicúa.
		if(numero == numInvertido) {
			res = true;
		}
		
		return res;
	}
}
