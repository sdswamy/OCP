package chapter4;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class PredicateBiPredicateDemo{
	
	public static void main(String... args){
		
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = s -> s.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test("Thanmaya"));
		
		BiPredicate<String, String> bi1 = String::startsWith;
		BiPredicate<String, String> bi2 = (string,prefix) -> string.startsWith(prefix);
		
		System.out.println(bi1.test("Thanmaya", "Tha"));
		System.out.println(bi2.test("Thanmaya", "maya"));
	}
}