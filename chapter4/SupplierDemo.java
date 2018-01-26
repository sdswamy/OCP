package chapter4;

import java.util.function.Supplier;
import java.time.LocalDate;

public class SupplierDemo{
	
	public static void main(String... args){
		
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = ()->LocalDate.now();
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1 + " " + d2);
		Supplier<StringBuffer> s3 = StringBuffer::new;
		Supplier<StringBuffer> s4 = () -> new StringBuffer();
		
		StringBuffer sb1 = s3.get();
		StringBuffer sb2 = s4.get();
		
		System.out.println(sb1 + " " + sb2);
		
	}
}