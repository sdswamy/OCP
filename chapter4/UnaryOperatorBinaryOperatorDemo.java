package chapter4;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class UnaryOperatorBinaryOperatorDemo{
	
	public static void main(String... args){
		
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = s -> s.toUpperCase();
		
		System.out.println(u1.apply("Kavitha"));
		System.out.println(u2.apply("Thanmaya"));
		
		BinaryOperator<String> bi1 = String::concat;
		BinaryOperator<String> bi2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(bi1.apply("Thanmaya", " Santhosh"));
		System.out.println(bi2.apply("Kavitha", " Surendran"));
	}
	
}