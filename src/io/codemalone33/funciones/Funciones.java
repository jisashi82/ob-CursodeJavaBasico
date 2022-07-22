package io.codemalone33.funciones;

public class Funciones {

	public static void main(String[] args) {
		var precio =90;
		var iva =11;
		
		double total = calcularTotal(precio, iva);
		
		System.out.println(total);

	}

	private static double calcularTotal(int precio, double iva) {
		
		return precio + (precio * iva/100);
	}

	private static double calcularTotal(int precio, int iva) {
		
		return precio + (precio * iva/100);
	}

}
