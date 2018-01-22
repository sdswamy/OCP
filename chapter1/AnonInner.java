package chapter1;

public class AnonInner{
	
	interface SaleTodayOnly{
		int dollarsOff();
		
		void print();
	}	
	
	private final SaleTodayOnly saleTodayOnly = new SaleTodayOnly(){
		
		public int dollarsOff(){
		//	System.out.println(basePrice);
			return 5;
		}
		
		public void print(){
			//System.out.println(basePrice);
		}
	};
	
	
	public int admission(int basePrice){
		
		
		return basePrice - saleTodayOnly.dollarsOff();
	}
	
	public static final void main(String [] args){
		AnonInner inner = new AnonInner();
		System.out.println(inner.admission(15));
		
	}
}