package A2;

public class Kaefig {

	private String name;
	private int anzahlLoewen;
	private Loewe platz1;
	private Loewe platz2;

	public Kaefig(String name, int anzahlLoewen) {

		this.name = name;
		this.anzahlLoewen = anzahlLoewen;

		
	}

	public int getAnzahlLoewen() {
		return anzahlLoewen;
	}

	public void setAnzahlLoewen(int anzahlLoewen) {
		this.anzahlLoewen = anzahlLoewen;
	}

	public void LoeweAusKaefig(String name) {

		if (platz1 != null) {
			if (name.equals(platz1.getName())) {
				platz1 = null;
			}
		}
		if (platz2 != null) {
			if (name.equals(platz2.getName())) {
				platz2 = null;
			}
		}
	}

	public void LoeweInKaefig(Loewe name) {
		if (platz1 == null) {
			platz1 = name;
		} else {
			if (platz2 == null) {
				platz2 = name;
			} else {
				System.out.println("Kein freier Platz mehr im Kafig!");
			}
		}

	}

	public void WerIstImKaefig(){
		
		System.out.println(platz1.toString());
		System.out.println(platz2.toString());
		
	}
	
	
}
