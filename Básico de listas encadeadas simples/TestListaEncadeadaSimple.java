
public class TestListaEncadeadaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<String> listaSimples = new SinglyLinkedList<>();
		System.out.println("primeiro: "+listaSimples.remove(0));
		listaSimples.insert(0, "0");
		listaSimples.insert(1, "1");
		listaSimples.insert(2, "2");
		listaSimples.insert(3, "3");
		System.out.println("lista atual");
		System.out.println(listaSimples.toString());
		listaSimples.insert(2, "21");
		System.out.println("lista inserindo 21 na posição 2");
		System.out.println(listaSimples.toString());
		System.out.println("lista inserindo 33 na posição 4");
		listaSimples.insert(4, "33");
		System.out.println(listaSimples.toString());
		System.out.println("lista inserindo 54 na posição 1");
		listaSimples.insert(1, "54");
		System.out.println(listaSimples.toString());
		
		listaSimples.insert(0, "76");
		System.out.println("lista inserindo 76 na posição 0");
		System.out.println(listaSimples.toString());
		
		listaSimples.insert(8, "400");
		System.out.println("lista inserindo 400 na ultima posição");
		System.out.println(listaSimples.toString());
		
		
		System.out.println("removido o index 0: "+listaSimples.remove(0));
		
		System.out.println(listaSimples.toString());
		System.out.println("removido o index 7: "+listaSimples.remove(7));
		System.out.println(listaSimples.toString());
		
		System.out.println("removido o index 5: "+listaSimples.remove(5));
		System.out.println(listaSimples.toString());
		
		System.out.println("removido o index 1: "+listaSimples.remove(1));
		System.out.println(listaSimples.toString());
		
		System.out.println("removido o index 5(LAST): "+listaSimples.remove(5));
		System.out.println(listaSimples.toString());
		
		System.out.println("removido o index 10(LAST): "+listaSimples.remove(10));
		System.out.println(listaSimples.toString());
	}

}
