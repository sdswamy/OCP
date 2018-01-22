package chapter3;

import chapter2.Animal;

public class Crate<T>{
	
	private T contents;
	
	public T emptyContents(){
		return contents;
	}
	
	public void packCrate(T contents){
		this.contents = contents;
	}
	
	public static void main(String... args){
		Crate<Animal> crate = new Crate<>();
		crate.packCrate(new Animal());
		System.out.println(crate.emptyContents());
		
		Crate<Integer> integerCrate = new Crate<>();
		integerCrate.packCrate(10);
		System.out.println(integerCrate.emptyContents());
		
		Crate<int> doesnotCompile = new Crate<>();
	}
}