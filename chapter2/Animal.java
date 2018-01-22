package chapter2;

import java.util.function.Predicate;

public class Animal{
	
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(){
		this("Lion", true, false);
	}
	public Animal(String species, boolean canHop, boolean canSwim){
		
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	
	public boolean canHop(){
		return canHop;
	}
	
	public boolean canSwim(){
		return canSwim;
	}
	
	@Override
	public String toString(){
		return species;
	}
	
	/*public void findMatchingAnimals(Animal animal, CheckTrait trait){
		
		if(trait.test(animal)){
			System.out.println(animal);
		}
	}*/
	
	public void findMatchingAnimals(Animal animal, Predicate<Animal> predicate){
		if(predicate.test(animal)){
			System.out.println(animal);
		}
	}
	
	public static final void main(String... args){
		Animal fish = new Animal("fish", false, true);
		Animal kangaroo = new Animal("kangaroo1", true, false);
		fish.findMatchingAnimals(fish, a -> a.canHop());
		fish.findMatchingAnimals(fish, a -> a.canSwim());
		kangaroo.findMatchingAnimals(kangaroo, a -> a.canHop());
	}
		
}