package chapter3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Squirrel{
	
	private String species;
	private int weight;
	
	public Squirrel(String species, int weight){	
		this.species = species;
		this.weight = weight;
	}
	
	public String getSpecies(){
		return species;
	}
	
	public int getWeight(){
		return weight;
	}
	
	@Override
	public String toString(){
		return species + " " + weight;
	}
	
	public static void main(String... args){
		Squirrel one = new Squirrel("one", 10);
		Squirrel two = new Squirrel("two", 20);
		Squirrel three = new Squirrel("one", 5);
		Squirrel four = new Squirrel("one", 8);
		Squirrel five = new Squirrel("one", 2);
		Squirrel six = new Squirrel("two", 10);
		
		List<Squirrel> squirrels = new ArrayList<>();
		squirrels.add(one);
		squirrels.add(two);
		squirrels.add(three);
		squirrels.add(four);
		squirrels.add(five);
		squirrels.add(six);
		
		System.out.println("Squirrels before sorting " + squirrels);
		Collections.sort(squirrels, new ComparatorDemo1());
		System.out.println("Squirrels after sorting " + squirrels);
	}
}