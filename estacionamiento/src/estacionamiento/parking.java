package estacionamiento;

public class parking extends Thread{

	private int lugares;
	
	public parking(){
		this.lugares =0;
	}
	
	public synchronized void estacionarAuto(String modelo, String color) {
		try {
			while(lugares==4){
				System.out.println("El auto: "+modelo+" color: "+color+" se encuentra esperando un lugar \n");
				wait();
			}
			lugares = lugares+1;
			System.out.println("// El auto: "+modelo+" color: "+color+" se ha estacionado // \n");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void salirParking(String modelo, String color) {
		
		lugares = lugares-1;
		System.out.println("## El auto: "+modelo+" color: "+color+" ha salido del estacionamiento ##\n");
		notifyAll();
		
	}
	
}
