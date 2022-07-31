package io.codemalone33.tema5;

import java.util.List;

import io.codemalone33.app.Coche;

public class CocheCRUDImpl implements CocheCRUD{

	@Override
	public void save(Coche c) {
		System.out.println("Guardando el Objeto Coche");
		
	}

	@Override
	public List<Coche> findAll() {
		System.out.println("Listando todos Los Objetos Coche");
		return null;
	}

	@Override
	public void delete(Coche c) {
		System.out.println("Eliminando un Objeto coche");		
	}

}
