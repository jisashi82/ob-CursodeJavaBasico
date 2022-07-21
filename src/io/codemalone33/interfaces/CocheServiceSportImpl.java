package io.codemalone33.interfaces;

import io.codemalone33.app.Coche;
import io.codemalone33.app.CocheHibrido;

public class CocheServiceSportImpl implements ServiceCoche{

	@Override
	public Coche crearCoche() {
		Coche c1= new CocheHibrido("Rojo", "Honda", "Civic", 1230.78, 3.99, 100, "UVHibrid2");
		System.out.println("Creando Coche de carreras");
		System.out.println(c1.toString());
		return c1;
	}

}
