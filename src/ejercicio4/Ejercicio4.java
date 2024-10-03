package ejercicio4;

public class Ejercicio4 {
	public static boolean esPrimo(int numero) {
		boolean res = true;

		for (int i = 2; i < numero; i++) {
			if ((numero % i) == 0) {
				
				res = false;
				break;
			}
		}

		return res;
	}
}
