package chapter3;

import java.util.List;
import java.util.ArrayList;

public class WildCardDemo{
	
	private static void printList(List<?> list){
		for(Object x : list){
			System.out.println(x);
		}
		
		list.add(new Integer(10));
	}
	
	public static void main(String [] args){
		List<String> list = new ArrayList<>();
		list.add("java");
		printList(list);
	}
}