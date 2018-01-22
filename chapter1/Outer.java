package chapter1;

public class Outer{

	private String greeting = "hi";
	
	private class Inner{
		
		private int repeat = 3;
		private final static int x = 10;
		public void go(){
			for(int i = 0; i < repeat; i++){
				System.out.println(greeting + " " + x);
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
		
		Outer outer = new Outer();
		//outer.callInner();
		
		//outer.new Inner().go();
		new Outer().new Inner().go();
		//new Outer().new Inner().go();
	}
}