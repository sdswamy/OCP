package chapter3;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ComputeIfPresentOrAbsent{
	
	public static void main(String... args){
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Jack", 1);
		map.put("Tom", 10);
		
		System.out.println(map);
		
		BiFunction<String, Integer, Integer> biFunction = (k,v) -> v + 1;
		map.computeIfPresent("Jack", biFunction);
		map.computeIfPresent("Sam", biFunction);
		System.out.println(map);
		
		Function<String, Integer> function = (k) -> 1;
		map.computeIfAbsent("Sam", function);
		map.computeIfAbsent("Jack", function);
		map.computeIfAbsent("Jerry", function);
		
		System.out.println(map);
		
		BiFunction<String, Integer, Integer> nullBiFunction = (k,v) -> null;
		map.computeIfPresent("Tom", nullBiFunction);
		System.out.println(map);
		
		
	}
}