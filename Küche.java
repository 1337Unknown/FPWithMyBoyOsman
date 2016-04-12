package A6;

public class Küche {

	private int AnzahlFliege;
	private Fliege[] fliegen;

	public Küche(int AnzahlFliege) {

		fliegen = new Fliege[AnzahlFliege];

	}

	public void zeigeAlleFliegenInDerKüche() {

		for (int i = 0; i < fliegen.length; i++) {

			if (fliegen[i] != null) {
				System.out.println(fliegen[i].getNr());
			}

		}

	}

	public void addFliege(Fliege oFliege) {

		for (int i = 0; i < fliegen.length; i++) {

			if (fliegen[i] == null) {
				fliegen[i] = oFliege;
				AnzahlFliege++;
				break;
			}

		}

	}

	public int getAnzahlFliege() {
		return AnzahlFliege;
	}

	public void setAnzahlFliege(int anzahlFliege) {
		this.AnzahlFliege = anzahlFliege;
	}

	public Fliege[] getFliegen() {
		return fliegen;
	}

	public void setFliegen(Fliege[] fliegen) {
		this.fliegen = fliegen;
	}

}
