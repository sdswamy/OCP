package chapter3;

import java.util.Comparator;

public class ComparatorDemo1 implements Comparator<Squirrel>{
	
	@Override
	public int compare(Squirrel one, Squirrel two){
		Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
		c = c.thenComparingInt(s -> s.getWeight());
		
		return c.compare(one, two);
	}
}