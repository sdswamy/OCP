package chapter3;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Squirrel>{

	@Override
	public int compare(Squirrel one, Squirrel two){
		int nameComparision = two.getSpecies().compareTo(one.getSpecies());
		if(nameComparision != 0) return nameComparision;
		else return one.getWeight() - two.getWeight();
	}
}