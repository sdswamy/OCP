package chapter3;

import java.util.Map;
import java.util.HashMap;

public class PutIfAbsentDemo{
	
	public static void main(String [] args){
		
		Map<String, String> map = new HashMap<>();
		map.put("Jerry", "kutty");
		map.put("Tom", null);
		
		System.out.println(map);
		map.putIfAbsent("Dog", "protector");
		map.putIfAbsent("Tom", "lollu");
		map.putIfAbsent("Jerry", "vallu");
		System.out.println("New map " + map);		
	}
}