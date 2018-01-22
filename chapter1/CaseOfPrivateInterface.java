package chapter1;

public class CaseOfPrivateInterface{
	
	private interface Secret{
		
		public void shh();
	}
	
	public interface NoSecret{
		public void noSecret();
	}
	
	private class DontTell implements Secret{
			
		public void shh(){
			System.out.println("This is a secret don't tell anyone");
		}
	}
	
	class TellEveryone implements NoSecret{
		public void noSecret(){
			System.out.println("This is not a secret, tell everyone");
		}
	}
	
	public static void main(String... args){
		
		System.out.println("Main");
		CaseOfPrivateInterface.DontTell dontTell = new CaseOfPrivateInterface().new DontTell();
		dontTell.shh();
		
		NoSecret tellEveryOne = new CaseOfPrivateInterface().new TellEveryone();
		tellEveryOne.noSecret();
	}
}