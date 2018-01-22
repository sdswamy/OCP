package chapter2.designpattern;

import java.util.List;
import java.util.ArrayList;

public class Animal{
	
	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	public Animal(String species, int age, List<String> favoriteFoods){
		this.species = species;
		this.age = age;
		this.favoriteFoods = favoriteFoods;
	}
	
	public String getSpecies(){
		
		return species;
	}
	
	public int getAge(){
		return age;
	}
	
	public List<String> getFavoriteFoods(){
		return new ArrayList<>(favoriteFoods);
	}
	
	public static class AnimalBuilder{
		private String species;
		private int age;
		private List<String> favoriteFoods;
		
		public AnimalBuilder setSpecies(String species){
			this.species = species;
			return this;
		}
		
		public AnimalBuilder setAge(int age){
			this.age = age;
			return this;
		}
		
		public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods){
			this.favoriteFoods = favoriteFoods;
			return this;
		}
		
		public Animal build(){
			return new Animal(species, age, favoriteFoods);
		}
	}
}
