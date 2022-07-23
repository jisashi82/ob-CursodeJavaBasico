package io.codemalone33.tema3;

/*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima 
 * el resultado final por consola. Tened en cuenta que los textos pueden venir de un 
 * array de tipo String. Por ejemplo:
 * String[] nombres = {"", "", "", ""}*/

public class Concatenar {

	public static void main(String[] args) {
		
		String[] nombres = {"Abel", "Jisashi", "Said", "Ana"};
		
		var texto="";
		
		for (int i = 0; i < nombres.length; i++) {
			texto += nombres[i] +" ";
		}
				
		System.out.println(texto.trim());
	}

}