package linear.examples;

import linear.base.DoublyLinkedList;
import linear.base.LinkedList;

public class TestDLLInteger {

	public static void main(String[] args) {
		LinkedList<Integer> list = new DoublyLinkedList<>();

		
		list.addFirst(7);
		
		list.addFirst(1);
		list.addFirst(3);
		list.addLast(5); 

		System.out.println(list);
		
		System.out.println(list.first());
		System.out.println(list.last());
		System.out.println(list.size());

		System.out.println(list.removeFirst());
		System.out.println(list);
	}

}
