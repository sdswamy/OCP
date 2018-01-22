package chapter1;

public class Animal{
	
	String name = "???";
	
	public void printName(){
		System.out.println("Name " + name);		
	}
	
	public void careFor(){
		play();
	}
	
	public void play(){
		System.out.println("Pet is playing");
	}
}