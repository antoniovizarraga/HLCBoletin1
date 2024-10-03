package ejercicio10;

public class Ejercicio10 {
	public static boolean esPalindromo(String texto) {
		boolean res = false;

		if (texto != null && !texto.equals("")) {
			StringBuilder temp = new StringBuilder();
			String delReves = "";
			
			String minuscula = texto.toLowerCase();

			temp.append(minuscula);

			temp.reverse();

			delReves = temp.toString();

			if (minuscula.equalsIgnoreCase(delReves)) {
				res = true;
			}
		}

		return res;
	}
}
