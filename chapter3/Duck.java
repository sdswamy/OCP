package chapter3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Duck implements Comparable<Duck>{
	
	private String name;
	private int weight;
	
	public Duck(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Duck duck){
		return this.name.compareTo(duck.name);
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	public static void main(String... args){
	
		Comparator<Duck> byWeight = new Comparator<Duck>(){
			public int compare(Duck d1, Duck d2){
				return d1.weight - d2.weight;	
			}
		};
		Duck one = new Duck("one", 90);
		Duck two = new Duck("two", 50);
		
		List<Duck> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, byWeight);
		System.out.println(list);
		
		Comparator<Duck> byWeight1 = (d1, d2) -> d1.weight - d2.weight;
		Collections.sort(list, byWeight1);
		System.out.println(list);
	}
}