package queue.examples;

import entities.Product;
import queue.base.LinkedQueue;
import queue.base.Queue;

public class TestQueueProduct {
	// fila - fifo - first in first out
	
	public static void main(String[] args) {
		Queue<Product> queue = new LinkedQueue<>();
		queue.enqueue(new Product("Camisa", 80d));
		queue.enqueue(new Product("Tenis", 200d));
		queue.enqueue(new Product("Meia", 15d));
		queue.enqueue(new Product("Calca", 150d));
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue.first());
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.isEmpty());
	}
}
