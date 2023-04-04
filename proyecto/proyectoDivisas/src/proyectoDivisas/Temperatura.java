package proyectoDivisas;

public class Temperatura extends Medidas {

	public Temperatura(double d, String magnitud) {
		super(d, magnitud);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversionDeMedida(Medidas medida1, Medidas medida2) throws Exception {
		double temperatura = 0;
		
		if(medida1.getMagnitud()=="F") {
			if(medida2.getMagnitud()=="C") {
				 temperatura=(medida1.getUnidad()-32)/1.8;
				return temperatura;
			}else {
				temperatura= (medida1.getUnidad()-32)/1.8+273.15;
				return temperatura;
			}
		}
		else if(medida1.getMagnitud()=="C") {
			if(medida2.getMagnitud()=="K") {
				temperatura= medida1.getUnidad()+273.15;
				return temperatura;
			}else if(medida2.getMagnitud()=="F") {
				temperatura= medida1.getUnidad()*1.8+32;
				return temperatura;
			}
		}
		else {
			if(medida2.getMagnitud()=="C") {

				temperatura= medida1.getUnidad()-273.15;
				return temperatura;
			}else {
				temperatura= (medida1.getUnidad()-273.15)*1.8+32;
				return temperatura;
			}
			
		}
		
		return temperatura;
		
		
			
	}

	

}
