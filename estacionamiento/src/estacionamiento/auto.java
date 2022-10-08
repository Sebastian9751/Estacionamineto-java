package estacionamiento;

public class auto extends Thread{
	private String modelo;
	private String color;
	private parking p;
	
	public auto(String modelo, parking p, String c) {
		this.modelo = modelo;
		this.color = c;
		this.p = p;
	}

	
	@Override
	public void run() {
		try {

			long estancia =(long)(Math.random() * 5000);
			p.estacionarAuto(modelo, color);
			sleep(estancia);
			p.salirParking(modelo, color);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}

