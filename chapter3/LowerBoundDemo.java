package chapter3;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LowerBoundDemo{
	
	public static void main(String [] args){	
		
		List<? super IOException> list = new ArrayList<Exception>();
		//list.add(new Exception());
		list.add(new IOException());
		list.add(new FileNotFoundException());
		
		List<String> list1 = new ArrayList<>();
		list1.add(5, "exception");
	}
}