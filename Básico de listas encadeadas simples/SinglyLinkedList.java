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

  public  void insert(int index, E e) {
	Node<E> walk = head;
    if(walk == null && size == 0 || index == 0) {
    	addFirst(e);
    } else if(size <= index ) {
    	addLast(e);
    } else {
    	// 0
    	// componente que vamos inserir.
    	Node component = new Node<>(e, null);
    	// varear a lista para atualizar os elementos(setNext)
    	for(int i=0 ; i <= index ;i++) {
    		if(i == (index -1)) {  
    			Node<E> prox = walk.getNext();
    			walk.setNext(component);
    			component.setNext(prox);
    			size++;
    		}
    		// 1
    		walk = walk.getNext();
    	}

    	
    }
  }
  
  public E remove(int index) {
	  Node<E> walk = head;
	  E removidoEle = null;
	 
	  if(size > 0 && index == 0) {
		  removidoEle  = removeFirst();
	  } 
	  
	  if( index >= size) {
		  index = size - 1;
	  }
	  
	  for(int i =0; i < index; i++) {
		  if(i == (index - 1)) {
			  removidoEle = walk.getNext().element;
				  
			  walk.setNext(walk.getNext().getNext());
			  
			  size--;
			  if(walk.getNext() == null) {
				  tail = walk;
			  }
		  }
		  
		  walk = walk.getNext();
	}
	  
	return removidoEle; 
  }
  public void eliminarDuplicados() {
	Node<E> walk = head;
	
	while(walk != null) {
		
    	Node<E> before = walk;
    	Node<E> nextWalk = walk.getNext();
    	while(nextWalk != null) {
    		Node<E> next = nextWalk.getNext();

			if(walk.getElement().equals(nextWalk.getElement())) {
				size--;
				
				before.setNext(next);
				
				if(nextWalk == tail) {
					tail = before;
				}
			} else {
				before = nextWalk;
			}
			nextWalk = next; 
    	}
    	walk = walk.getNext();
    }
  }
}
