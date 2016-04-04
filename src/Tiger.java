
public class Tiger {

	
	private String name;
	private int energie;
	
	public Tiger(String name, int energie) {
		
		this.name = name;
		this.energie = energie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fressen(){
		
		energie = energie + 10;
		
	}
	
	public void laufen(){
		
		energie = energie - 10;
		
	}
	
	
	public void rennen(){
		energie = energie - 20;;
	}
	
	public void schlafen(){
		
		energie = energie + 10;
	}
	
	
	public String toString(){
		return "Tiger mit Name " + name + " hat " + energie + " Energie." ;
	}
	
	public int getEnergie()
	{
		return energie;
	}
	
}
