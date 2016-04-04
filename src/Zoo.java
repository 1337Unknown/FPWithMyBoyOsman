
public class Zoo {

	public static void main(String[] args) {
		
		
		Tiger t1 = new Tiger("Osman", 100);
		
		//t1.setName("Hans");
		t1.fressen();
		t1.schlafen();
		t1.rennen();
		t1.rennen();
		t1.laufen();
		t1.schlafen();
		
		
		
		
		
		System.out.println(t1);
		
		System.out.println("Tiger mit Name " + t1.getName() + " hat " + t1.getEnergie() + " Energie.");
	}

}
