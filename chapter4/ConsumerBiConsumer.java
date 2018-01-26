package chapter4;

import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.Map;
import java.util.HashMap;

public class ConsumerBiConsumer{
	
	public static void main(String... args){
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = s -> System.out.println(s);
		
		c1.accept("Thanmaya");
		c2.accept("Kavitha");
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> bi1 = map::put;
		BiConsumer<String, Integer> bi2 = (k,v) -> map.put(k,v);
		
		bi1.accept("Thanmaya", 7);
		bi2.accept("Kavitha", 36);
		
		System.out.println(map);
	}
		
}