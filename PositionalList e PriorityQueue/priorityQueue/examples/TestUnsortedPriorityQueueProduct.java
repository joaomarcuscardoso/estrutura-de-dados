package priorityQueue.examples;

import java.util.Comparator;

import entities.Product;
import priorityQueue.base.PriorityQueue;
import priorityQueue.base.UnsortedPriorityQueue;

public class TestUnsortedPriorityQueueProduct {

	public static void main(String[] args) {
		System.out.println("Testing a primitive key...");

		PriorityQueue<Integer, Product> priorityQueue = new UnsortedPriorityQueue<>();
		priorityQueue.insert(7, new Product("Camisa", 80d));
		priorityQueue.insert(5, new Product("Tenis", 200d));
		priorityQueue.insert(12, new Product("Meia", 15d));
		priorityQueue.insert(2, new Product("Calca", 150d));
		System.out.println(priorityQueue.toString());
		System.out.println(priorityQueue.min().getValue());
		System.out.println(priorityQueue.removeMin().getValue());
		System.out.println(priorityQueue.toString());
		priorityQueue.insert(6, new Product("Oculos", 500d));
		priorityQueue.removeMin();
		System.out.println(priorityQueue.toString());
		System.out.println();

		System.out.println("Testing a structured key...");


		System.out.println("Testing a structured key with a Comparator...");
		
		PriorityQueue<MyKey, Product> otherPriorityQueue = new UnsortedPriorityQueue<>(new MyKeyComparator());
		otherPriorityQueue.insert(new MyKey(1, 2), new Product("Camisa", 80d));
		otherPriorityQueue.insert(new MyKey(4, 7), new Product("Tenis", 200d));
		otherPriorityQueue.insert(new MyKey(3, 6), new Product("Meia", 15d));
		otherPriorityQueue.insert(new MyKey(8, 5), new Product("Calca", 150d));
		System.out.println(otherPriorityQueue.toString());
		System.out.println(otherPriorityQueue.min().getValue());
		System.out.println(otherPriorityQueue.removeMin().getValue());
		System.out.println(otherPriorityQueue.toString());
		otherPriorityQueue.insert(new MyKey(5, 5), new Product("Oculos", 500d));
		otherPriorityQueue.removeMin();
		System.out.println(otherPriorityQueue.toString());
		System.out.println();
	
	}

	private static class MyKeyComparator implements Comparator<MyKey> {
		public int compare(MyKey o1, MyKey o2) {
			if (o1.b < o2.b)
				return -1;
			if (o1.b > o2.b)
				return 1;
			return 0;
		}
	}

	private static class MyKey implements Comparable<MyKey> {
		int a, b;

		public MyKey(int _a, int _b) {
			a = _a;
			b = _b;
		}

		public String toString() {
			return a + ";" + b;
		}

		public int compareTo(MyKey o) {
			if (this.a == o.a && this.b == o.b)
				return 0;
			else if ((this.a + this.b) < (o.a + o.b))
				return -1;
			else
				return 1;
		}
	}
}