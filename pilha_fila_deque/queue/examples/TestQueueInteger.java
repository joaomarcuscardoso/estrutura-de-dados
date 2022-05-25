package queue.examples;

import queue.base.ArrayQueue;
import queue.base.Queue;

public class TestQueueInteger {
	// fila - fifo - first in first out
	
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayQueue<>(3);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(5);
		queue.enqueue(7);
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
