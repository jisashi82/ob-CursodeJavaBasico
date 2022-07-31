package io.codemalone33.tema5;

import io.codemalone33.app.Coche;

public class AppCoche {
	
	static CocheCRUD cocheCRUD = new CocheCRUDImpl();

	public static void main(String[] args) {
		
		Coche c= new Coche("Azul", "Ford", "Figo", 1300.24, 4.25, 180);
		
		cocheCRUD.findAll();
		
		cocheCRUD.save(c);
		
		cocheCRUD.delete(c);

	}

}
