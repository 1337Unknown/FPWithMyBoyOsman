package A3;

public class Bauernhof {

	public static void main(String[] args) {
		
		// Kuh erstellen
		Kuh k1 = new Kuh(5,'W',false);
		Kuh k2 = new Kuh(6,'W',false);
		
		k1.setName("Dora");
		k2.setName("Miriam");
		
		
		Stall s1 = new Stall("SuperStall", 0);
		
		
		s1.KuhInStall(k1);
		
		s1.WerIstImStall();
		
		s1.KuhInStall(k2);
		
		s1.WerIstImStall();
		
		//Kalb erstellen
		Kuh kalb1 = new Kuh(1, 'W', true);
		Kuh kalb2 = new Kuh(2, 'W', true);
		
		
		
		
	//	k1.KalbInKuh(kalb1);
	//	k1.KalbInKuh(kalb2);
	//	s1.WerIstImStall();
		
		
		
		
	}

}
