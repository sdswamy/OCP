package chapter4;

import java.util.function.Function;
import java.util.function.BiFunction;

public class FunctionBiFunctionDemo{
	
	public static void main(String... args){
		
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = s -> s.length();
		
		System.out.println(f1.apply("Thanmaya"));
		System.out.println(f2.apply("Kavitha"));
		
		BiFunction<String, String, String> bi1 = String::concat;
		BiFunction<String, String, String> bi2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(bi1.apply("Thanmaya", " Santhosh"));
		System.out.println(bi2.apply("Kavitha", " Surendran"));
	}
}