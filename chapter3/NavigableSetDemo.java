package chapter3;

import java.util.TreeSet;
import java.util.NavigableSet;

public class NavigableSetDemo{

	public static void main(String... args){
		NavigableSet<Integer> set = new TreeSet<>();
		
		for(int index = 0; index < 20; index++){
			set.add(index);
		}
		
		System.out.println(set.floor(15)); //15
		System.out.println(set.lower(15)); //14;
		
		System.out.println(set.ceiling(18)); 
		System.out.println(set.higher(18));
		
		System.out.println(set.floor(0));
		System.out.println(set.lower(0));
		
	}
}