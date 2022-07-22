package io.codemalone33.tema2;

public class Funciones {

	public static void main(String[] args) {
		double precio =90.5;
		var iva =11.7;
		
		// llama a la funcion calcularTotal con el IVA de tipo double
		double total = calcularTotal(precio, iva);		
		System.out.println(total);
		
		
		
		
		double precio2 = 100;
		var iva2= 11;
		
		//llama a la funcion calcularTotal con el IVA de tipo integer
		double total2 = calcularTotal(precio2, iva2);		
		System.out.println(total2);

	}

	private static double calcularTotal(double precio, double iva) {
		
		return precio + (precio * iva/100);
	}

	private static double calcularTotal(double precio, int iva) {
		
		return precio + (precio * iva/100);
	}

}
