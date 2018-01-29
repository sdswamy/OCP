package chapter4;

import java.util.Optional;


public class OptionalDemo{
	
	private static Optional<Double> average(int... scores){
		System.out.println(scores.length);
		if(scores.length == 0)
			return Optional.empty();
		double sum = 0;
		for(int score : scores){
			sum += score;
		}
		
		return Optional.of(sum / scores.length);
	}
	
	public static void main(String... args){
		
		Optional<Double> opt = average(20,20,20);
		opt.ifPresent(System.out::println);
		/*if(opt.isPresent()){
			double avg = opt.get();
			System.out.println(avg);
		}*/
		
		Optional<Double> opt1 = average();
		System.out.println(opt1.orElse(Double.NaN));
		System.out.println(opt1.orElseGet(() -> Math.random()));
		System.out.println(opt1.orElseThrow(() -> new IllegalStateException()));
		/*if(opt1.isPresent()){
		}else{
			System.out.println("Optional is empty");
		}*/
	}
}