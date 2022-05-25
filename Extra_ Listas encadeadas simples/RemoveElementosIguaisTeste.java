public class RemoveElementosIguaisTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<String> lista = new SinglyLinkedList<>();
		lista.addLast("JA");
		lista.addLast("VA");
		lista.addLast("JA");
		lista.addLast("JAVA É OTIMO");
		lista.addLast("JA");
		lista.addLast("BOM");
		lista.addLast("VA");
//		System.out.println(lista.toString());
		lista.eliminarDuplicados();
		System.out.println(lista.size());
		System.out.println(lista.toString());
	}

}
