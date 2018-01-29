package chapter4;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemoFull{
	
	public static void main(String... args){
		
		List<String> names = Arrays.asList("Kavitha", "Santhosh", "Thanmaya", "Kavi", "Tanu");
		
		names.stream().filter(s -> s.length() == 4).sorted().limit(2).forEach(System.out::println);
		
		/*Stream<String> stream = Stream.generate(() -> "Tanu");
		stream.filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);*/
		
		Stream<Integer> stream = Stream.iterate(1, x -> x + 1);
		stream.filter(i -> i%2 == 1).limit(5).peek(System.out::print).forEach(System.out::print);
	}
}