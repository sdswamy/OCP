package chapter3;

import java.util.Queue;
import java.util.ArrayDeque;
public class ArrayDequeDemo1{

	public static void main(String... args){
		
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.push("hello");
		queue.push("hi");
		queue.push("ola");
		queue.offer("bye");
		queue.poll();
		String pop1 = queue.pop();
		String peek1 = queue.peek();
		
		System.out.println(pop1 + " " + peek1);
		while(queue.peek() != null)
			System.out.println(queue.pop());
	}
}