package io.codemalone33.app;

public class CocheElectrico extends Coche{
	
	private String motorElectrico;

	public CocheElectrico() {
		
	}
	
	public CocheElectrico(String motorElectrico) {
		this.motorElectrico = motorElectrico;
	}
	
	public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo,Integer velocidad, String motorElectrico) {
		super(color, fabricante, modelo, peso, largo, velocidad);
		this.motorElectrico= motorElectrico;
	}

	@Override
	public String toString() {
		return String.format(
				"CocheElectrico [motorElectrico=%s, color=%s, fabricante=%s, modelo=%s, peso=%s, Largo=%s, velocidad=%s]",
				motorElectrico, getColor(), getFabricante(), getModelo(), getPeso(), getLargo(), getVelocidad());
	}
	
	@Override
	public void acelerar(Integer cantidad) {
		int velocidadAjustada = cantidad *2;
		super.acelerar(velocidadAjustada);
	}
	
	
	
	
	
	
	
	

}
