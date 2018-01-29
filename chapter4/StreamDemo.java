package chapter4;

import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.Optional;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class StreamDemo{
	
	static Consumer<Object> consumer = System.out::println;
	public static void main(String... args){
		streamCountDemo();
		streamMinDemo();
		streamMaxDemo();
		streamFindAnyDemo();
		streamFindFirstDemo();
		streamAnyMatchDemo();
		streamAllMatchDemo();
		streamNoneMatch();
		streamForEachDemo();
		streamReduceDemo();
		streamCollectDemo();
	}
	
	private static void streamCountDemo(){				
		Stream<String> stream = Stream.of("Thanmaya", "Kavitha", "Santhosh");
		
		consumer.accept(stream.count());
		//System.out.println("Stream size " + stream.count());
	}
	
	private static void streamMinDemo(){
		Stream<String> stream = Stream.of("Thanmaya", "Kavitha", "Santhosh");
		Optional<String> min = stream.min((s1,s2) -> s1.length()-s2.length());
		min.ifPresent(System.out::println);
	}
	
	private static void streamMaxDemo(){
		Stream<String> stream = Stream.of("Thanmaya", "Kavitha", "Santhosh");
		Optional<String> max = stream.max((s1,s2) -> s1.compareTo(s2));
		max.ifPresent(System.out::println);
		
		Stream<String> stream1 = Stream.empty();
		Optional<String> max1 = stream1.max((s1,s2) -> s1.compareTo(s2));
		consumer.accept(max1.orElse(null));
	}
	
	private static void streamFindAnyDemo(){
		Stream<String> stream = Stream.empty();
		Optional<String> any = stream.findAny();
		consumer.accept("Nothing in the stream " + any.orElse("Better luck next time"));
		
		Stream<String> stream1 = Stream.of("Kavitha", "Thanmaya", "Santhosh");
		Optional<String> any1 = stream1.findAny();
		consumer.accept(any1.orElse("next time"));
	}
	
	private static void streamFindFirstDemo(){
		Stream<String> stream = Stream.of("Kavitha", "Thanmaya", "Santhosh");
		Optional<String> first = stream.findFirst();
		consumer.accept(first.orElse("better luck next time"));
		
		Stream<Double> stream1 = Stream.generate(() -> Math.random());
		//Optional<Double> anyNumber = stream7.findAny();
		stream1.findAny().ifPresent(consumer);
	}
		
	private static void streamAnyMatchDemo(){
		List<String> list = Arrays.asList("Kavitha", "Thanmaya", "Santhosh", "5");
		Predicate<String> predicate = s -> Character.isLetter(s.charAt(0));
		consumer.accept("Any match " + list.stream().anyMatch(predicate));
		
		Stream<String> stream = Stream.generate(() -> "Thanmaya");
		consumer.accept("Any match on infinite stream " + stream.anyMatch(predicate));
	}
	
	private static void streamAllMatchDemo(){
		List<String> list = Arrays.asList("Kavitha", "Thanmaya", "Santhosh", "5");
		Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));
		consumer.accept("All match " + list.stream().allMatch(predicate));
		
		//This will run in-definitely
		/*Stream<String> stream = Stream.generate(() -> "Kavitha");
		consumer.accept("All match on infinite stream " + stream.allMatch(predicate));*/
	}
	
	private static void streamNoneMatch(){
		List<String> list = Arrays.asList("Kavitha", "Thanmaya", "Santhosh");
		Predicate<String> predicate = y -> Character.isLetter(y.charAt(0));
		consumer.accept("None match " + list.stream().noneMatch(predicate));
	}
	
	private static void streamForEachDemo(){
		Stream<String> stream = Stream.of("Kavitha", "Thanamaya", "Santhosh");
		stream.forEach(System.out::print);
		System.out.println();
	}
	
	private static void streamReduceDemo(){
		List<Integer> list = Arrays.asList(10, 20, 30);
		Optional<Integer> result = list.stream().reduce((x,y) -> x* y);
		result.ifPresent(consumer);
		
		List<String> list1 = Arrays.asList("Thanmaya", "Kavitha", "Santhosh");
		String finalString = list1.stream().reduce("", (s,s1) -> s.concat(s1));
		consumer.accept("Using lambda " + finalString);
		
		String finalString1 = list1.stream().reduce("", String::concat);
		consumer.accept("Using method reference " + finalString1);
	}
	
	private static void streamCollectDemo(){
		List<String> list = Arrays.asList("Kavitha", "Thanamaya", "Santhosh");
		consumer.accept("Collect " + list.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append));
		
		consumer.accept("Tree set " + list.stream().collect(TreeSet::new, TreeSet::add, TreeSet::addAll));
		consumer.accept("Collector Tree set " + list.stream().collect(Collectors.toCollection(TreeSet::new)));
		consumer.accept("Collector Set " + list.stream().collect(Collectors.toSet()));
		consumer.accept("Collector List " + list.stream().collect(Collectors.toList()));
	}
}