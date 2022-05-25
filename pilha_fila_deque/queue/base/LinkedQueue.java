package queue.base;

import linear.base.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E> {
	// fila - fifo - first in first out

	private SinglyLinkedList<E> list = new SinglyLinkedList<>();

	public LinkedQueue() {
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enqueue(E element) {
		list.addLast(element);
	}

	public E first() {
		return list.first();
	}

	public E dequeue() {
		return list.removeFirst();
	}

	public String toString() {
		return list.toString();
	}
}
