import linear.base.LinkedList;

public class SinglyLinkedList<E> implements LinkedList<E> {

  @SuppressWarnings("hiding")
  private class Node<E> {
    private E element;
    private Node<E> next;

    public Node(E e, Node<E> n) {
      element = e;
      next = n;
    }

    public E getElement() {
      return element;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> n) {
      next = n;
    }
  }

  private Node<E> head = null;
  private Node<E> tail = null;
  private int size = 0;

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E first() {
    if (isEmpty())
      return null;
    return head.getElement();
  }

  public E last() {
    if (isEmpty())
      return null;
    return tail.getElement();
  }

  public void addFirst(E e) {
    head = new Node<>(e, head);
    if (size == 0)
      tail = head;
    size++;
  }

  public void addLast(E e) {
    Node<E> newest = new Node<>(e, null);
    if (isEmpty())
      head = newest;
    else
      tail.setNext(newest);
    tail = newest;
    size++;
  }

  public E removeFirst() {
    if (isEmpty())
      return null;
    E answer = head.getElement();
    head = head.getNext();
    size--;
    if (size == 0)
      tail = null;
    return answer;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("(");
    Node<E> walk = head;
    while (walk != null) {
      sb.append(walk.getElement());
      if (walk != tail)
        sb.append(", ");
      walk = walk.getNext();
    }
    sb.append(")");
    return sb.toString();
  }

  public void eliminarDuplicados() {
	Node<E> walk = head;
    Node<E> comparar= tail;
    for(int i =0; i < size;i++) {
    	Node<E> ant = tail;
    	if(walk.getElement() != comparar.getElement()) {
    		comparar = walk;
    	} else {
    		ant.setNext(walk.getNext());
    		size++;
    		if(walk.getElement() == tail.getElement()) {
    			
    			tail = ant;
    		} else {
    			ant = ant.getNext();
    		}
    	}
    	walk = walk.getNext();
    }
    
    System.out.println("comparar: "+comparar);
  }
}
