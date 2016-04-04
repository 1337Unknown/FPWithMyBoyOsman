package A2;

public class Zoo {

	public static void main(String[] args) {
		
		
		Loewe l1 = new Loewe (10,"W");
		Loewe l2 = new Loewe (20,"M");
		Loewe l3 = new Loewe (25,"M");
		
		l1.setName("Marta");
		l2.setName("Hans");
		l3.setName("Peter");
		
		Kaefig k1 = new Kaefig("gefähliche Ecke", 0);
		
		
		k1.LoeweInKaefig(l2);
		k1.LoeweInKaefig(l3);
		
		k1.WerIstImKaefig();
		
		k1.LoeweAusKaefig("Peter");
		k1.LoeweInKaefig(l1);
		
		k1.WerIstImKaefig();
		
		
		
		
		
	}

}
