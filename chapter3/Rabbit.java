package chapter3;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

public class Rabbit{
	
	private int id;
	
	public Rabbit(int id){
		this.id = id;
	}
	
	@Override
	public String toString(){
		return id + " ";
	}
	public static void main(String... args){	
		
		Comparator<Rabbit> comparator = (r1, r2) -> r1.id - r2.id;
		Set<Rabbit> rabbits = new TreeSet<>(comparator);
		Rabbit one = new Rabbit(10);
		Rabbit two = new Rabbit(5);
		Rabbit three = new Rabbit(45);
		Rabbit four = new Rabbit(4);
		Rabbit five = new Rabbit(2);
		
		rabbits.add(one);
		rabbits.add(two);
		rabbits.add(three);
		rabbits.add(four);
		rabbits.add(five);
		System.out.println(rabbits);
		System.out.println(Collections.binarySearch(new ArrayList<Rabbit>(rabbits), new Rabbit(1), comparator));
	}
}