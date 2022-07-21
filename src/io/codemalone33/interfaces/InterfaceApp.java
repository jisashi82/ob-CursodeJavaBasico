package io.codemalone33.interfaces;

import java.util.Scanner;

public class InterfaceApp {

	public static void main(String[] args) {
		
		ServiceCoche service1 = new CocheServiceClasicoImpl();
		ServiceCoche service2 = new CocheServiceSportImpl();
		
		service1.crearCoche();
		service2.crearCoche();
		
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Introduce un numero: ");
			var num= scanner.nextInt();
			System.out.println("El numero introducido es:" + num);
		}while(scanner.hasNext());
		scanner.close();
		

	}

}
