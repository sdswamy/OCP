package chapter1;

public class StaticInnerClassDemo{

	private String greeting = "hi";
	
	static class Inner{
		
		private int repeat = 3;
		private final static int x = 40;
		public void go(){
			StaticInnerClassDemo outer = new StaticInnerClassDemo();
			for(int i = 0; i < repeat; i++){
				System.out.println(outer.greeting + " " + x);
			}
		}
		
		/*public final static void stop(){
			System.out.println("Stopped");
		}*/
	}
	
	public void callInner(){
		
		Inner inner = new Inner();
		inner.go();
		System.out.println(inner.repeat);
	}
	
	public static void main(String... args){
		
		
		//outer.callInner();
		
		//outer.new Inner().go();
		new Inner().go();
		//new Outer().new Inner().go();
	}
}