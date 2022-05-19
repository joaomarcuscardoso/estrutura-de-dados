package deque.examples;

import deque.base.ArrayDeque;
import deque.base.Deque;
import entities.Product;

public class TestDequeProduct {

	public static void main(String[] args) {
		Deque<Product> deque = new ArrayDeque<>(5);
		
		deque.addFirst(new Product("Camisa", 80d));
		deque.addFirst(new Product("Tenis", 200d));
		deque.addLast(new Product("Meia", 15d));
		deque.addLast(new Product("Calca", 150d));
		
		System.out.println(deque);
		System.out.println(deque.first());
		System.out.println(deque.last());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
		System.out.println(deque.toString());
		System.out.println(deque.size());
		System.out.println(deque.isEmpty());
		
		deque.addLast(new Product("Chapeu", 20d));
		deque.addFirst(new Product("Relogio", 250d));
		System.out.println(deque);
		deque.removeFirst();
		deque.removeFirst();
		deque.addLast(new Product("Anel", 450d));
		deque.addLast(new Product("Oculos", 500d));
		System.out.println(deque);
	}
}
