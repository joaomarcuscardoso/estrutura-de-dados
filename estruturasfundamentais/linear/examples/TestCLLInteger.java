package linear.examples;

import linear.base.CircularlyLinkedList;
import linear.base.LinkedList;

public class TestCLLInteger {

	public static void main(String[] args) {
		LinkedList<Integer> list = new CircularlyLinkedList<>();

		list.addFirst(1);
		list.addFirst(3);
		list.addLast(5); 

		System.out.println(list);
		
		((CircularlyLinkedList<Integer>)list).rotate();
		System.out.println(list);

		System.out.println(list.first());
		System.out.println(list.last());
		System.out.println(list.size());

		System.out.println(list.removeFirst());
		System.out.println(list);
	}

}
