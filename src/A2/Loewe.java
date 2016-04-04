package A2;

public class Loewe {

	
	private String name;
	private int alter;
	private String Geschlecht;
	
	public Loewe(int alter, String geschlecht) {
		
		this.alter = alter;
		this.Geschlecht = geschlecht;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAlter(){
		return alter;
	}
	
	public String getGeschelcht(){
		return Geschlecht;
	}
	
	public String toString(){
		
		return "Löwe " + name + " ist im Käfig";
	}
}
