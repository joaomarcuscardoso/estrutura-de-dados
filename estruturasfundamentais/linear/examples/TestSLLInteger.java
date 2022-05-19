package linear.examples;

import linear.base.SinglyLinkedList;

public class TestSLLInteger {

	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		
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
