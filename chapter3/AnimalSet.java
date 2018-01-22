package chapter3;

import java.util.Set;
import java.util.HashSet;

public class AnimalSet{
	
	private String name;
	
	public AnimalSet(String name){
		this.name = name;	
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	//@Override
	/*public int hashCode(){
		return 1;
	}*/
	
	@Override
	public boolean equals(Object obj){
		return true;
	}
	
	public static void main(String... args){
		AnimalSet one = new AnimalSet("Lion");
		AnimalSet two = new AnimalSet("Lion");
		
		Set<AnimalSet> set = new HashSet<>();
		set.add(one);
		set.add(two);
		
		System.out.println(set);
	}
}