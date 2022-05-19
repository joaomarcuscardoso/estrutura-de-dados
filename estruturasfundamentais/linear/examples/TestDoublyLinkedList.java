package linear.examples;

import entities.Product;
import linear.base.DoublyLinkedList;

public class TestDoublyLinkedList {
	
	public static void main(String[] args) {
		DoublyLinkedList<Product> list = new DoublyLinkedList<>();
		list.addFirst(new Product("Camisa", 80d));
		list.addFirst(new Product("Tenis", 200d));
		list.addLast(new Product("Meia", 15d));
		list.addLast(new Product("Calca", 150d));
		System.out.println(list.toString());
		System.out.println(list.first().toString());
		System.out.println(list.last().toString());
		list.removeFirst();
		System.out.println(list.toString());
		list.removeLast();
		System.out.println(list.toString());
		System.out.println(list.size());
	}
}
