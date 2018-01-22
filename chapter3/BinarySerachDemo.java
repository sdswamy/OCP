package chapter3;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class BinarySerachDemo{
	
	public static void main(String... args){
		List<String> names = Arrays.asList("Fluffy", "Hoppy");
		Comparator<String> c = Comparator.reverseOrder();
		System.out.println(names);
	//	Collections.sort(names, c);	
		
		//System.out.println(names);
		int index = Collections.binarySearch(names, "Hoppy", c);
		System.out.println(index);
		
		List<Integer> numbers = Arrays.asList(4, 2, 2, 1);
		int index1 = Collections.binarySearch(numbers, 1);
		System.out.println(index1);
	}
}