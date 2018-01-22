package chapter1;

public class EnumSeasonDemo{
	
	public static final void main(String... args){
		
		Seasons s = Seasons.WINTER;
		Seasons s1 = Seasons.SUMMER;
		System.out.println(Seasons.SUMMER);
		
		System.out.println(s == Seasons.SUMMER);
		System.out.println(s1 == Seasons.SUMMER);
		
		for(Seasons season : Seasons.values()){
			System.out.println(season.name() + " " + season.ordinal());
		}
		
		Seasons s2 = Seasons.valueOf("FALL");
		System.out.println(s2 == Seasons.FALL);
		
		enumSwitch(s2);
		enumSwitch(s1);
		enumSwitch(s);
		
	}
	
	private static void enumSwitch(Seasons season){
		switch(season){
			case SUMMER:
				System.out.println("Time for a pool");
				break;
			case WINTER:
				System.out.println("Time for a beer");
				break;
			default:
				System.out.println("Not sure what to do");
				break;
		}
	}
}