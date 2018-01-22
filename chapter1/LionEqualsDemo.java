package chapter1;

public class LionEqualsDemo{
	
	private int id;
	private String name;
	
	public LionEqualsDemo(int id){
		
		this.id = id;
	}
	
	public LionEqualsDemo(int id, String name){
		
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object object){
		
		boolean isEqual = false;
		
		if(this == object){
			return true;
		}
		
		if(object instanceof LionEqualsDemo){
			LionEqualsDemo other = (LionEqualsDemo) object;
			isEqual = (this.id == other.id && this.name != null && other.name !=null && this.name.equals(other.name))? true : false;
		}		
		return isEqual;
	}
	
	public static void main(String... args){
		
		LionEqualsDemo l1 = new LionEqualsDemo(10);
		LionEqualsDemo l2 = new LionEqualsDemo(10);
		
		System.out.println("l1 equals l2 " + l1.equals(l2));
		
		LionEqualsDemo l3 = new LionEqualsDemo(10);
		LionEqualsDemo l4 = null;
		
		System.out.println("l3 equals l4 " + l3.equals(l4));
		
		LionEqualsDemo l5 = new LionEqualsDemo(10);
		LionEqualsDemo l6 = new LionEqualsDemo(12);
		
		System.out.println("l5 equals l6 " + l5.equals(l6));
		
		LionEqualsDemo l7 = new LionEqualsDemo(10);
		String l8 = new String("12");
		
		System.out.println("l7 equals l8 " + l7.equals(l8));
		
		LionEqualsDemo l9 = new LionEqualsDemo(10);
		LionEqualsDemo l10 = l9;
		
		System.out.println("l9 equals l10 " + l9.equals(l10));

		LionEqualsDemo l11 = new LionEqualsDemo(10, "Jack");
		LionEqualsDemo l12 = new LionEqualsDemo(10, "Jack");
		
		System.out.println("l9 equals l10 " + l9.equals(l10));		
	}
	
}