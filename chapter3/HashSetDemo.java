package chapter3;

import java.util.Set;
import java.util.HashSet;

public class HashSetDemo{
	
	@Override
	public boolean equals(Object o){
		return false;
	}
	
	@Override
	public int hashCode(){
		return 10;
	}
	
	public static void main(String... args){
		
		Set<HashSetDemo> set = new HashSet<>();
		set.add(new HashSetDemo());
		set.add(new HashSetDemo());
		
		System.out.println(set);
		
	}
}