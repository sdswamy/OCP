package chapter1;

public class HippoToStringDemo{
	
	private int id;
	private String name;
	private double weight;
	
	public HippoToStringDemo(int id, String name, int weight){
		
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		
		return "Hippo id is " + id + " name is " + name + " and weight is " + weight;
	}
	
	public static void main(String... args){
		
		HippoToStringDemo obj = new HippoToStringDemo(10, "Jack", 1000);
		System.out.println(obj);
	}
}