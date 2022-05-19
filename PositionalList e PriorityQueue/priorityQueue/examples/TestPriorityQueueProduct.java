package priorityQueue.examples;

import entities.Product;
import priorityQueue.base.PriorityQueue;
import priorityQueue.base.SortedPriorityQueue;
import priorityQueue.base.UnsortedPriorityQueue;

public class TestPriorityQueueProduct {

	public static void main(String[] args) {
		PriorityQueue<Integer, Product> pq;
		
		pq = new SortedPriorityQueue<>();
		
		pq.insert(7, new Product("Camisa", 80d));
		pq.insert(5, new Product("Tenis", 200d));
		pq.insert(12, new Product("Meia", 15d));
		pq.insert(2, new Product("Calca", 150d));	
		
		System.out.println("Sorted > " + pq);
		System.out.println(pq.min().getValue());
		
		pq = new UnsortedPriorityQueue<>();
		
		pq.insert(7, new Product("Camisa", 80d));
		pq.insert(5, new Product("Tenis", 200d));
		pq.insert(12, new Product("Meia", 15d));
		pq.insert(2, new Product("Calca", 150d));	
		
		System.out.println("Unsorted > " + pq);
		System.out.println(pq.min().getValue());
		
	}

}
