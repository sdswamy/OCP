package chapter3;

import java.util.*;

public class QueueListDemo{
	
	public static void main(String... args){
		//List<Integer> list = new LinkedList<>();
		Queue<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(12);
		list.remove(1);
		
		System.out.println(list);
	}
}