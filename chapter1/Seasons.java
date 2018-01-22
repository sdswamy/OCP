package chapter1;

public enum Seasons{

	WINTER("Low", "10am-2pm"){
		public void printName(){
			System.out.println(Seasons.WINTER);
		}
	}, 
	SUMMER("High", "8am-9pm"){
		public void printName(){
			System.out.println(Seasons.SUMMER);
		}
	}
	, 
	SPRING("Medium", "9am-4pm"){
		public void printName(){
			System.out.println(Seasons.SPRING);
		}
	}
	, 
	FALL("Medium", "9am-4pm"){
		public void printName(){
			System.out.println(Seasons.FALL);
		}
	}, 
	RAIN("Medium", "9am-5pm"){
		public void printHours(){
			System.out.println(d1);
		}
		
		public void printName(){
			System.out.println(Seasons.RAIN);
		}
	};
	
	private String expectedVistors;
	private String duration;
	private static String d1;
	
	Seasons(String visitors, String d){
		expectedVistors = visitors;
		duration = d;	
	}
	
	
	
	public static void main(String... args){
		System.out.println("Main");
		Seasons.SUMMER.printExpectedvisitor();
		Seasons.SUMMER.printHours();
		Seasons.RAIN.printHours();
		Seasons.SPRING.printName();
	}
	
	public void printExpectedvisitor(){
		System.out.println(expectedVistors);	
	}
	
	public void printHours(){
		System.out.println(duration);
	}
	
	public abstract void printName();
}
