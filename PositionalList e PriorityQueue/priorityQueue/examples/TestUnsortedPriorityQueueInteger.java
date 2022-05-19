package priorityQueue.examples;

import priorityQueue.base.PriorityQueue;
import priorityQueue.base.UnsortedPriorityQueue;

public class TestUnsortedPriorityQueueInteger {

	public static void main(String[] args) {
		System.out.println("Testing a primitive key...");
		PriorityQueue<Integer, Integer> priorityQueue = new UnsortedPriorityQueue<>();

		// quanto menor o valor maior a prioridade

		priorityQueue.insert(7, 1);
		priorityQueue.insert(5, 3);
		priorityQueue.insert(12, 8);
		priorityQueue.insert(2, 5);

		System.out.println(priorityQueue);
		System.out.println(priorityQueue.min().getValue()); // qual o valor com maior prioridade
		
		// remove com maior prioridade e retorna o removido
		System.out.println(priorityQueue.removeMin().getValue());
		
		
		System.out.println(priorityQueue);

		priorityQueue.insert(6, 9);
		
		System.out.println(priorityQueue);

		priorityQueue.removeMin();
		System.out.println(priorityQueue);
		System.out.println();

	}

}
