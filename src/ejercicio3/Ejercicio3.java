package ejercicio3;

public class Ejercicio3 {
	public static String abeja(int numero) {
		String res = "";
		
		if (numero % 3 == 0) {
			res += "fizz";
		}
		
		if (numero % 5 == 0) {
			res += "buzz";
		}

		return res;
	}
}
