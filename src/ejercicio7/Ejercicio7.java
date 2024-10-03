package ejercicio7;

public class Ejercicio7 {
	public static boolean checkDate(int day, int month, int year) {
		boolean res = false;

		/*
		 * Si quisiéramos que el año no pueda ser mayor que el actual, podríamos
		 * utilizar esta línea de código para obtener el año de la fecha actual. Esta es
		 * una característica nueva que se añadió a partir de Java 8. Simplemente
		 * comprobaríamos que el valor del año no pueda ser mayor al del año actual.
		 * Para usarlo, habría que importar el paquete: "java.time.Year".
		 */

		// int currentYear = Year.now().getValue();
		if (year > 0) {

			switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				if (day > 0 && day <= 31)
					res = true;
				break;
			case 4, 6, 9, 11:
				if (day > 0 && day < 31)
					res = true;
				break;
			case 2:
				if (year % 4 == 0) {
					if (day > 0 && day <= 29) {
						res = true;

					} else {
						if (day > 0 && day <= 28) {
							res = true;
						}

					}
				}
				break;

			}
		} else if (year > 0 && year % 4 == 0) {
			if (day > 0 && day <= 29)
				res = true;
		}

		return res;
	}
}
