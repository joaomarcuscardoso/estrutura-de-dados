
public class TestCircularyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularlyLinkedList<Integer> lista = new CircularlyLinkedList<>();
		
		lista.addLast(7);
		lista.addLast(4);
		lista.addLast(3);
		lista.addLast(5);
		lista.addLast(1);
		lista.inverse();
		System.out.println(lista.toString());
	}

}
