package io.codemalone33.tema4;

public class SmartDevice {
	
	private String marca;
	private String color;
	private int anioFabricacion;
	private String hechoEn;
	private int bateria;
	private boolean wifi;
	private boolean blue2;
	private double precio;
	private double peso;
	
	public SmartDevice() {
		
	}
	
	public SmartDevice(String marca, String color, int anioFabricacion, String hechoEn, int bateria, boolean wifi,
			boolean blue2, double precio, double peso) {
		super();
		this.marca = marca;
		this.color = color;
		this.anioFabricacion = anioFabricacion;
		this.hechoEn = hechoEn;
		this.bateria = bateria;
		this.wifi = wifi;
		this.blue2 = blue2;
		this.precio = precio;
		this.peso = peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getHechoEn() {
		return hechoEn;
	}

	public void setHechoEn(String hechoEn) {
		this.hechoEn = hechoEn;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isBlue2() {
		return blue2;
	}

	public void setBlue2(boolean blue2) {
		this.blue2 = blue2;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	

}
