package chapter3;

import java.util.*;
import java.io.*;
public class LowerBoundWildCard{
	
	public static void main(String... args){
		List<? super IOException> list = new ArrayList<Exception>();
		//list.add(new Exception());
		list.add(new IOException());
		list.add(new FileNotFoundException());
	}
}