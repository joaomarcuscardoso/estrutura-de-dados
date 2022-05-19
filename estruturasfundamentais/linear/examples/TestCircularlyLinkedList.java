package linear.examples;

import entities.Product;
import linear.base.CircularlyLinkedList;

public class TestCircularlyLinkedList {

	public static void main(String[] args) {
		
		CircularlyLinkedList<Product> list = new CircularlyLinkedList<>();
		list.addFirst(new Product("Camisa", 80d));
		list.addFirst(new Product("Tenis", 200d));
		list.addLast(new Product("Meia", 15d));
		list.addLast(new Product("Calca", 150d));
		System.out.println(list.toString());
		
		list.rotate();
		System.out.println(list.toString());
		
		System.out.println(list.first().toString());
		System.out.println(list.last().toString());
		list.removeFirst();
		System.out.println(list.toString());
		System.out.println(list.size());
	}
}
