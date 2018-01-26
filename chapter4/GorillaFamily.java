package chapter4;

public class GorillaFamily{
	
	String walk = "walk";
	
	void everyOnePlays(boolean baby){
		String approach = "amble";
		// approach = "run";
		
		play(() -> walk);
		play(() -> baby ?"hitch a ride" : "run");
		play(() -> approach);
	}
	
	void play(Gorilla g){
		System.out.println(g.move());
	}
	
	public static void main(String [] args){
		GorillaFamily family = new GorillaFamily();
		family.everyOnePlays(true);
	}
}