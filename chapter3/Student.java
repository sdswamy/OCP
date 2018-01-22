package chapter3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student{
	
	private String name;
	private int id;
	
	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString(){
		return name + " " + id;
	}
	
	public static void main(String... args){
		Student thanmaya = new Student("Thanmaya", 10);
		Student kavitha = new Student("Kavitha", 18);
		Student santhosh = new Student("Santhosh", 3);
		Student dunmaya = new Student("Thanmaya", 20);
		
		List<Student> students = new ArrayList<>();
		students.add(dunmaya);
		students.add(thanmaya);
		students.add(kavitha);
		students.add(santhosh);
		System.out.println(students);
		
		Comparator<Student> compartor = (s1, s2) -> {Comparator<Student> c = Comparator.comparing(stu -> stu.name);
		                                             c.thenComparingInt(stu -> stu.id);
													return c.compare(s1,s2);
													};
		
		
		Collections.sort(students, compartor);
		System.out.println(students);
		
	}
}