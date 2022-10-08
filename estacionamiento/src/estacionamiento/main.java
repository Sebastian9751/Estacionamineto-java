package estacionamiento;

public class main {

	public static void main(String[] args) {
		parking sc = new parking();
		auto a1 = new auto("BMW", sc,"Mageta");
		auto a2 = new auto("Cadillac ATS", sc,"Sliver");
		auto a3 = new auto("Bugatti DIVO", sc,"Gold");
		auto a4 = new auto("Chevrolet Aveo", sc,"Bonze");
		auto a5 = new auto("Ferrari F8 Tributo", sc,"Gunmetal");
		auto a6 = new auto("Ford Fiesta", sc,"Platinum");
		auto a7 = new auto("Honda CR-V", sc,"Nikel");
		auto a8 = new auto("Jeep Cherokee", sc,"Rose Gold");
		auto a9 = new auto("Mustang March-E", sc,"Blaze Orange");
		auto a10 = new auto("Porsche 911", sc,"Cheese");
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
		a6.start();
		a7.start();
		a8.start();
		a9.start();
		a10.start();
		
		
	}

}
