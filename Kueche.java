package FpAufgabeFliegen;

public class Kueche {

	private int anzahlFliegen;
	private Fliege[] fliegen;

	public Kueche(int anzahlFliege) {
		fliegen = new Fliege(anzahlFliegen);
	}

	public int getAnzhalFliengen() {
		return anzahlFliegen;
	}
	
	

	public void setAnzahlFliegen(int anzahlFliegen) {
		this.anzahlFliegen = anzahlFliegen;
	}

	public void zeigeAlleFliegenInDerKueche() {
		for (int i = 0; i < fliegen.length; i++) {
			if (fliegen[i] != null) {
				System.out.println(fliegen[i] != null.getNr());
			}
		}
	}

	public void addFliege(Fliege oFliege) {
		for (int i = 0; i < fliegen.length; i++) {
			if(fliegen[i] == null){
				fliegen[i] = oFliege;
				anzahlFliegen++;
				break;
			}
		}
	}
}
