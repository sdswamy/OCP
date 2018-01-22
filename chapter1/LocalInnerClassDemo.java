package chapter1;

public class LocalInnerClassDemo{
	
	private int length = 5;
	
	public void calculate(int height){
		int width = 20;
		
		class LocalInner{
			private final static int x = 10;
			public void multiply(){
				System.out.println(length * width * height + x);
			}

		}
		
		//width = 10;
		LocalInner inner = new LocalInner();
		inner.multiply();
		
		//return null;
	}
	
	public static void main(String [] args){
		LocalInnerClassDemo demo = new LocalInnerClassDemo();
		demo.calculate(5);
	}
}