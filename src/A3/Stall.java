package A3;

public class Stall {

	
	private String Name;
	private int AnzahlKuehe;
	public Kuh platz1;
	public Kuh platz2;
	
	//Konstruktor
	public Stall(String Name, int AnzahlKuehe){
		
		this.Name = Name;
		this.AnzahlKuehe = AnzahlKuehe;
		
	}
	
	public void setAnzahlKuehe(int AnzahlKuehe){
		this.AnzahlKuehe = AnzahlKuehe;
	}
	
	public int getAnzahlKuehe(){
		
		return AnzahlKuehe;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	public String getName(){
		return Name;
	}
	
	public void KuhInStall(Kuh Name){
		
		if(platz1 == null){
			platz1 = Name;
		}else {
			if(platz2 == null){
			platz2 = Name;
			} else{
				System.out.println("Kein freier Platz mehr im Stall");
			}
		}	
	}
	
	public void KuhAusStall(String Name){
		
		if(platz1 != null){
			if(Name.equals(platz1.getName())){
				platz1 = null;
			}
		}
		else 
			if(platz2 != null){
				if(Name.equals(platz1.getName())){
					platz2 = null;
				}
			}
	}
	
	public void WerIstImStall(){
		System.out.println(platz1.toString());
		System.out.println(platz2.toString());
	}
	
	public void NameDerKinder(){
		
		if(platz1.kalb = false){
			System.out.println(platz1.kalb1.getName());
		}
		if(platz2.kalb = true){
			System.out.println(platz2.kalb2.getName());
		}
		
	}
	
	
}
