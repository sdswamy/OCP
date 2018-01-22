package chapter1;

public class EqualsDemo{
	
	public static void main(String... args){
		String s = "abc";
		StringBuilder sb = new StringBuilder("abc");
		
		Object obj = sb;
		//System.out.println(s == sb);
		System.out.println(s == obj);
		System.out.println(s.equals(sb));
	}
}