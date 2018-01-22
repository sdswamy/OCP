package chapter1;

public enum OnlyOne{
	ONCE(true);
	
	private OnlyOne(boolean b){
		System.out.println("constructing");
	}
	
	public static final void main(String... args){
		
		OnlyOne firstCall = OnlyOne.ONCE;
		OnlyOne secondCall = OnlyOne.ONCE;
		
	}
}