package chapter3;

import java.util.function.*;
import java.util.List;
import java.util.ArrayList;

public class MethodRefConsumer{
	
	public static void main(String [] args){
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("aac");
		list.add("abe");
		list.add("xyz");
		
		list.forEach(System.out::println);
		
		list.removeIf(s -> s.startsWith("x"));
		
		System.out.println("After removing ");
		list.forEach(System.out::println);
		
		list.replaceAll(s -> s + "1");
		System.out.println("After Replace ");
		list.forEach(System.out::println);
		
	}
}