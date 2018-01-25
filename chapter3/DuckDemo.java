package chapter3;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class DuckDemo{
	
	private String name;
	private int weight;
	
	public static void main(String... args){
		
		List<Duck> list = new ArrayList<>();
		list.add(new Duck("abc", 12));
		list.add(new Duck("aac" , 10));
		list.add(new Duck("xyz", 8));
		list.add(new Duck("aaa", 1));
		list.add(new Duck("AAA", 10));
		list.add(new Duck("123", 50));
		System.out.println("Before sorting " + list);
		//Comparator<Duck> comparatorByWeight = (d1, d2) -> DuckHelper.compareByWeight(d1,d2);
		Comparator<Duck> comparatorByWeight = DuckHelper::compareByWeight;
		Collections.sort(list, comparatorByWeight);
		System.out.println("After sorting by weight " + list);
		Comparator<Duck> comparatorByName = DuckHelper::compareByName;
		Collections.sort(list, comparatorByName);
		System.out.println("After sorting by name " + list);
	}
}