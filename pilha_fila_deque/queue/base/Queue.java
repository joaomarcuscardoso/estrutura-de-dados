package queue.base;

public interface Queue<E> {
	// fila - fifo - first in first out

	int size();
	boolean isEmpty();
	void enqueue(E e);
	E first();
	E dequeue();
}
