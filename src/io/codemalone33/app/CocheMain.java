package io.codemalone33.app;

public class CocheMain {

	public static void main(String[] args) {
		
		Coche coche1= new Coche();
		coche1.setColor("Negro");
		coche1.setFabricante("Mazda");
		coche1.setModelo("M3");
		System.out.println(coche1.toString());
		
		
		Coche coche2= new Coche("Azul", "Ford", "Figo", 1300.24, 4.25, 180);
		System.out.println(coche2.toString());
		
		CocheElectrico cocheElectrico = new CocheElectrico("Rojo", "Chevrolet", "Spark", 1100.33, 3.45, 15, "Tesla");
		cocheElectrico.acelerar(40);
		System.out.println(cocheElectrico.toString());
		
		
		//polimorfismo
		Coche coche3 = new CocheHibrido("Rojo", "Honda", "Civic", 1230.78, 3.99, 100, "UVHibrid");
		System.out.println(coche3.toString());
	}

}
