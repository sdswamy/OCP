package chapter1.cat;

import chapter1.BigCat;

public class Lynx extends BigCat{
	
		public static void main(String [] args){
		
		BigCat bigCat = new BigCat();
		//BigCat lynx = new Lynx();
		Lynx lynx = new Lynx();
		System.out.println("name " + bigCat.name);
		System.out.println("has fur " + lynx.hasFur);
		System.out.println("has paws " + bigCat.hasPaws);
		System.out.println("id " + bigCat.id);
	}
}