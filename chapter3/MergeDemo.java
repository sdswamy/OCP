package chapter3;

import java.util.function.BiFunction;
import java.util.Map;
import java.util.HashMap;

public class MergeDemo{
	
	public static void main(String... args){
		
		BiFunction<String, String, String> biFunction = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		BiFunction<String, String, String> nullBiFunction = (v1,v2) -> null;
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Tom", "Bus Tour");
		map.put("Jack", "Tram");
		map.put("Sam", null);
		
		System.out.println(map);
		
		map.merge("Tom", "Skyride", biFunction);
		map.merge("Jack", "Skyride", biFunction);
		map.merge("Jill", "Tram", biFunction);
		map.merge("Sam", "Car", biFunction);
		System.out.println("After merge " + map);
			
		map.merge("Sam", "Bike", nullBiFunction);
		System.out.println(map);
		map.merge("Jerry", "Car", nullBiFunction);
		System.out.println(map);
	}
}