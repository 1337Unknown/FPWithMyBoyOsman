package A3;

public class Kuh {

	
	private String Name;
	private int Alter;
	private char Geschlecht;
	public boolean kalb;
	public Kuh kalb1;
	public Kuh kalb2;
	
	//Konstruktor
	public Kuh(int Alter, char Geschlecht, boolean kalb){
		this.Alter = Alter;
		this.Geschlecht = Geschlecht;
		this.kalb = kalb;
	}
	
	
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	public String getName(){
		return Name;
	}
	
	public int getAlter(){
		return Alter;
	}
	
	public char getGeschlecht(){
		return Geschlecht;
	}
	
	public void KalbInKuh(Kuh Name){
		
		if(kalb1 == null){
			
			kalb1 = Name;
			
		}else {
		if(kalb2 == null){
			
			kalb2 = Name;
			}else {
				System.out.println("Kein freier Platz mehr in der Kuh!");
			}
		}
		
	}
	
	public String toString(){
		
		return "Die Kuh " + Name + "  ist im Stall mit "  ;
	}
	
}
