package deque.examples;

import deque.base.ArrayDeque;
import deque.base.Deque;

public class TestDequeInteger {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>(3);

		deque.addFirst(1);
		deque.addFirst(3);
		deque.addLast(5);
		deque.addLast(7); 

		System.out.println(deque);
		
		System.out.println(deque.first());
		System.out.println(deque.last());
		System.out.println(deque.removeFirst());
		System.out.println(deque);
		System.out.println(deque.removeLast());
		System.out.println(deque.size());
		System.out.println(deque.isEmpty());

		deque.addLast(2);
		deque.addFirst(8);
		
		System.out.println(deque);
		deque.removeFirst();
		deque.removeFirst();

		deque.addLast(9);
		deque.addLast(6);
		
		System.out.println(deque);
	}

}
