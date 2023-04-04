package proyectoDivisas;

public abstract class Medidas {
	private double unidad;
	private String magnitud;

	public Medidas(double unidad2,String magnitud) {
		this.unidad=unidad2;
		this.magnitud=magnitud;
	}
	
	public String getMagnitud() {
		return magnitud;
	}
	public void setMagnitud(String magnitud) {
		this.magnitud = magnitud;
	}



	public double getUnidad() {
		return unidad;
	}



	public void setUnidad(double unidad) {
		this.unidad = unidad;
	}
	
	public abstract double conversionDeMedida(Medidas medida1,Medidas medida2)throws Exception;
	
	
}
