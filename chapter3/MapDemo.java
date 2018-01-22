package chapter3;

import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class MapDemo{
	
	public static void main(String... args){
		
		Map<String, String> hashTable = new Hashtable<>();
		Map<String, String> hashMap = new HashMap<>();
		
	//	hashTable.put(null, "Hello");
		hashMap.put("Hello", null);
		hashMap.put("hai", null);
		hashMap.put("123", null);
		hashMap.put(null, null);
		hashMap.put(null, "123");
		
		
		
		System.out.println(hashMap);
	}
}