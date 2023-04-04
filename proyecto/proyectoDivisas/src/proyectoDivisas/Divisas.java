package proyectoDivisas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Divisas extends Medidas {
	
	
	public Divisas(double unidad,String magnitud) {
		super(unidad,magnitud);
	}
	@Override
	public double conversionDeMedida(Medidas medida1, Medidas medida2) throws Exception{
       URL url =new URL("https://api.apilayer.com/exchangerates_data/convert?to="+medida2.getMagnitud()+"&from="+medida1.getMagnitud()+"&amount="+medida1.getUnidad()+"");
		
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
        conn.setRequestProperty("apikey", "ogNWMXI8sqcNgD8lMajzMFRDfAtmR3Uc");
		conn.setRequestMethod("GET");
		
		
		BufferedReader in= new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String output;
		StringBuffer response= new StringBuffer();


		while((output=in.readLine())!=null) {
			response.append(output);
		}
		
		in.close();
		
		
		
		double resultado=Math.round(Float.parseFloat(response.substring(response.indexOf("result")+9, response.length()-1))*100.0)/100.0;
		
		
        return resultado;

		
	}
	
	
	
}
