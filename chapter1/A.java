package chapter1;

public class A{
	private int x = 10;
	
	private class B{
		
		private int x = 20;
		
		private class C{
			
			private int x = 30;
			
			private void allTheX(){
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(A.this.x);
			}
		}
	}
	
	public static void main(String... args){
		
		A a = new A();
		//System.out.println(a.x);
		
		A.B b = a.new B();
		//System.out.println(b.x);
		
		A.B.C c = b.new C();
		//System.out.println(c.x);
		
		c.allTheX();
	}
}