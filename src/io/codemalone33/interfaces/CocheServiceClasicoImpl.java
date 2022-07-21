package io.codemalone33.interfaces;

import io.codemalone33.app.Coche;
import io.codemalone33.app.CocheElectrico;

public class CocheServiceClasicoImpl implements ServiceCoche {

	@Override
	public Coche crearCoche() {
		Coche c1= new CocheElectrico();
		System.out.println("Creando Coche clasico");
		System.out.println(c1.toString());
		return c1;
	}

}
