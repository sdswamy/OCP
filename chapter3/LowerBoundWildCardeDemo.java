package chapter3;

import java.util.*;

public class LowerBoundWildCardeDemo{
	
	String name;
	
	public LowerBoundWildCardeDemo(String name){
		this.name = name;
	}
	
	public static void main(String... args){
		
		List<String> strings = new ArrayList<>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<>(strings);
		addSound(strings);
		addSound(objects);
	}
	
	public static void addSound(List<? super String> list){
		list.add("quack");
		System.out.println(list);
		
		LowerBoundWildCardeDemo one = new LowerBoundWildCardeDemo("test");
		LowerBoundWildCardeDemo two = new LowerBoundWildCardeDemo("hai");

		Set<LowerBoundWildCardeDemo> set = new HashSet<>();
		System.out.println(set.add(one));
		System.out.println(set.add(two));

		System.out.println(set.size());	
		
	}
	
	@Override
	public boolean equals(Object obj){
		return true;
	}
	
	@Override
	public int hashCode(){
		return 42;
	}
}