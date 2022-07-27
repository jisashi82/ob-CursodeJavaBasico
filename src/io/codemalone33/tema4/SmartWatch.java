package io.codemalone33.tema4;

public class SmartWatch extends SmartDevice{
	private boolean sensorCardiaco;
	private boolean podometro;
	
	public SmartWatch() {
		// TODO Auto-generated constructor stub
	}

	public SmartWatch(String marca, String color, int anioFabricacion, String hechoEn, int bateria, boolean wifi,
			boolean blue2, double precio, double peso, boolean sensorCardiaco, boolean podometro) {
		super(marca, color, anioFabricacion, hechoEn, bateria, wifi, blue2, precio, peso);
		this.sensorCardiaco=sensorCardiaco;
		this.podometro=podometro;
	}

	@Override
	public String toString() {
		return String.format(
				"SmartWatch [sensorCardiaco=%s, podometro=%s, getMarca()=%s, getColor()=%s, getAnioFabricacion()=%s, getHechoEn()=%s, getBateria()=%s, isWifi()=%s, isBlue2()=%s, getPrecio()=%s, getPeso()=%s]",
				sensorCardiaco, podometro, getMarca(), getColor(), getAnioFabricacion(), getHechoEn(), getBateria(),
				isWifi(), isBlue2(), getPrecio(), getPeso());
	}
	
	
	
}
