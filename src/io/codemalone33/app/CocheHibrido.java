package io.codemalone33.app;

public class CocheHibrido extends Coche{

	String motorHibrido;
	
	public CocheHibrido() {
		// TODO Auto-generated constructor stub
	}

	public CocheHibrido(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad, String motorHibrido) {
		super(color, fabricante, modelo, peso, largo, velocidad);
		this.motorHibrido = motorHibrido;
	}

	@Override
	public String toString() {
		return String.format(
				"CocheHibrido [motorHibrido=%s, Color=%s, Fabricante=%s, Modelo=%s, Peso=%s, Largo=%s, Velocidad=%s, ]",
				motorHibrido, getColor(), getFabricante(), getModelo(), getPeso(), getLargo(), getVelocidad());
	}
	
	
	
	
}
