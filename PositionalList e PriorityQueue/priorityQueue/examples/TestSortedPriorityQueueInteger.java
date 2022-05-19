package priorityQueue.examples;

import java.util.Comparator;

import priorityQueue.base.PriorityQueue;
import priorityQueue.base.SortedPriorityQueue;

public class TestSortedPriorityQueueInteger {

	public static void main(String[] args) {
		System.out.println("Testing a primitive key...");
		PriorityQueue<Integer, Integer> priorityQueue = new SortedPriorityQueue<>();

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

		System.out.println("Testing a primitive key... Another rule to define the priority");
		
		priorityQueue = new SortedPriorityQueue<>(new MaiorTemMaisPrioridade());

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
	
	private static class MaiorTemMaisPrioridade implements Comparator<Integer> {

		@Override
		public int compare(Integer k1, Integer k2) {
			if (k1.equals(k2)) {
				return 0;
			} else
				if (k1 > k2) {
					return -1;
				} else {
					return 1;
				}
		}
		
	}
	
}
