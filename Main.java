package A6;

public class Main {

	public static void main(String[] args) {
		
		
		
		K�che k1 = new K�che(100);
		
		
		
		for(int i=1; i < 56; i++){
			
			//Fliege f1 = new Fliege(1,5);
			k1.addFliege(new Fliege(1,i));
			
		}
		
		
		k1.zeigeAlleFliegenInDerK�che();
		
		

	}

}
