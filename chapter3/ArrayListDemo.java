package chapter3;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo{
	
	public static final void main(String... args){
		List<String> list = new ArrayList<>();
		for(int index = 0; index < 10; index++){
			boolean added = list.add("Tiger");
			System.out.println(added);
		}
		list.add(10, "End");
		System.out.println(list.size());
		
		System.out.println(list.remove("abc"));
		System.out.println(list.remove("Tiger"));
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list.size());
		System.out.println(list.set(list.size()-1,"new end"));
		list.set(15, "test");
	}
}