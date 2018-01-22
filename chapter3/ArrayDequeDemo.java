package chapter3;

import java.util.Queue;
import java.util.ArrayDeque;

public class ArrayDequeDemo{
	
	public static void main(String... args){
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		
		queue.offer(10);
		System.out.println(queue + "offer");
		queue.offer(20);
		System.out.println(queue + "offer");
		queue.push(5);
		System.out.println(queue + "push");
		System.out.println(queue.peek() + "peek");
		queue.offer(30);
		System.out.println(queue + "offer");
		System.out.println(queue.peek() + "peek");
		System.out.println(queue.pop() + "pop");
		System.out.println(queue);
		
		
	}
}
