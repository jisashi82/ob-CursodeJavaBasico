package io.codemalone33.tema4;

public class SmartPhone extends SmartDevice {

	private String proveedor4G;

	public SmartPhone() {
	}

	public SmartPhone(String marca, String color, int anioFabricacion, String hechoEn, int bateria, boolean wifi,
			boolean blue2, double precio, double peso, String proveedor4G) {
		super(marca, color, anioFabricacion, hechoEn, bateria, wifi, blue2, precio, peso);
		this.proveedor4G = proveedor4G;

	}

	@Override
	public String toString() {
		return String.format(
				"SmartPhone [proveedor4G=%s, getMarca()=%s, getColor()=%s, getAnioFabricacion()=%s, getHechoEn()=%s, getBateria()=%s, isWifi()=%s, isBlue2()=%s, getPrecio()=%s, getPeso()=%s]",
				proveedor4G, getMarca(), getColor(), getAnioFabricacion(), getHechoEn(), getBateria(), isWifi(),
				isBlue2(), getPrecio(), getPeso());
	}

}