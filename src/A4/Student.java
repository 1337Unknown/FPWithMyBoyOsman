package A4;

public class Student {

	
	private String Name;
	private int Alter;
	private char Geschlecht;
	private String Studiengang;
	private int MNR;
	
	
	public Student(int Alter, char Geschlecht, String Studiengang){
		this.Alter = Alter;
		this.Geschlecht = Geschlecht;
		this.Studiengang = Studiengang;
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
	
}
