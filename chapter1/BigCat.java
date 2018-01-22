package chapter1;

public class BigCat{
	
	public String name = "cat";
	protected boolean hasFur = true;
	boolean hasPaws = false;
	private int id;
	
	public static void main(String [] args){
		
		BigCat bigCat = new BigCat();
		System.out.println("name " + bigCat.name);
		System.out.println("has fur " + bigCat.hasFur);
		System.out.println("has paws " + bigCat.hasPaws);
		System.out.println("id " + bigCat.id);
	}
}