package chapter4;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;

public class StreamIntermediateOperationDemo{

	private static Consumer<Object> consumer = System.out::println;
	public static void main(String [] args){
		streamFilterDemo();
		streamDistinctDemo();
		streamLimitSkipDemo();
		streamMapDemo();
		streamFlatMapDemo();
		streamSortedDemo();
		streamPeekDemo();
	}
	
	private static void streamFilterDemo(){
		
		Stream<String> stream = Stream.of("Thanamaya", "Kavitha", "Santhosh", "Tanu", "Kavi");
		stream.filter(s -> s.startsWith("Kavi")).forEach(System.out::print);
		consumer.accept("");
		
		Stream<Integer> stream1 = Stream.iterate(1, n -> n + 1);
		stream1.filter(i -> i%2 ==0).limit(10).forEach(System.out::print);
		consumer.accept("");	
	}
	
	private static void streamDistinctDemo(){
		Stream<String> stream = Stream.of("duck", "duck", "duck", "goose");
		stream.distinct().forEach(System.out::print);
		consumer.accept("");
	}
	
	private static void streamLimitSkipDemo(){
		Stream<Integer> stream = Stream.iterate(1, n -> n + 1);
		stream.skip(5).limit(3).forEach(System.out::print);
		consumer.accept("");
	}
	
	private static void streamMapDemo(){
		Stream<String> stream = Stream.of("Kavitha", "Thanmaya", "Tanu", "Santhosh", "Kavi");
		stream.map(s -> s.startsWith("Kavi")).forEach(System.out::print);
		consumer.accept("");
		
		Stream<Integer> stream1 = Stream.iterate(1, n -> n + 1);
		List<Boolean> list = stream1.map(i -> (i%2 == 0)).limit(10).collect(Collectors.toList());
		consumer.accept(list);
	}
	
	private static void streamFlatMapDemo(){
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Thanamaya");
		List<String> two = Arrays.asList("Kavitha", "Santhosh");
		
		Stream<List<String>> stream = Stream.of(zero, one, two);
		stream.flatMap(l -> l.stream()).forEach(consumer);
		//stream.forEach(consumer);
	}
	
	private static void streamSortedDemo(){
		Stream<String> stream = Stream.of("Kavitha", "Kavi", "Thanmaya", "Tanu", "Santhosh");
		stream.sorted().forEach(System.out::print);
		consumer.accept("");
		
		Stream<String> stream1 = Stream.of("Kavitha", "Kavi", "Thanmaya", "Tanu", "Santhosh");
		stream1.sorted((x,y) -> y.compareTo(x)).forEach(System.out::print);
		consumer.accept("");
	}
	
	private static void streamPeekDemo(){
		Stream<String> stream = Stream.of("Kavitha", "Thanmaya", "Santhosh");
		long count = stream.peek(consumer).count();
		consumer.accept(count);
	}
}