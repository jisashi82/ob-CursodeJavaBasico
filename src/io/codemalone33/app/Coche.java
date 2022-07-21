package io.codemalone33.app;

public class Coche {
	
	private String color;
	private String fabricante;
	private String modelo;
	private Double peso;
	private Double Largo;
	private Integer velocidad =0;
	
	public Coche() {
	}

	public Coche(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad) {
		super();
		this.color = color;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.peso = peso;
		this.Largo = largo;
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getLargo() {
		return Largo;
	}

	public void setLargo(Double largo) {
		Largo = largo;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
	
	public void acelerar(Integer cantidad) {
		if(cantidad > 0 && cantidad <= 120) {
			this.velocidad += cantidad;
		}
	}

	@Override
	public String toString() {
		return String.format("Coche [color=%s, fabricante=%s, modelo=%s, peso=%s, Largo=%s, velocidad=%s]", color,
				fabricante, modelo, peso, Largo, velocidad);
	}
	
	
	
	

}
