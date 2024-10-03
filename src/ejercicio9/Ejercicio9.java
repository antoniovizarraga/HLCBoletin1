package ejercicio9;

public class Ejercicio9 {
	public static int binario(int valorDecimal) {
		int res = 0;
		
		String temp = Integer.toBinaryString(valorDecimal);
		
		res = Integer.valueOf(temp);
		
		return res;
	}
}
