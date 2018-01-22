package chapter3;

import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class LambdasDemo{
	
	public static void main(String... args){
		
		List<String> list = new ArrayList<>();
		
		list.add("Thanmaya");
		list.add("Kavitha");
		list.add("Santhosh");
		System.out.println(list);
		list.removeIf(s -> s.contains("o"));
		System.out.println(list);
		
		List<Integer> numbers = asList(1,2,3,4);
		System.out.println(numbers);
		
		numbers.replaceAll(x -> x * 3);
		System.out.println(numbers);
		
		numbers.forEach(System.out::println);
	}
}