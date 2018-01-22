package chapter2;

import java.util.ArrayList;
import chapter2.designpattern.Animal;

public class AnimalBuilderDemo{
	
	public static void main(String [] args){
		
		Animal.AnimalBuilder builder = new Animal.AnimalBuilder();
		System.out.println(builder);
		
		Animal animal = builder.setSpecies("Tiger").setAge(5).setFavoriteFoods(new ArrayList<>()).build();
		System.out.println(animal.getSpecies());
		System.out.println(animal.getAge());
		System.out.println(animal.getFavoriteFoods());
		
	}
}