package priorityQueue.examples.geradorSenhas;

public class testeGeradorSenha {


	public static void main(String[] args) {

		GeradorSenhas gerador = new GeradorSenhas();


		gerador.pressNormal();
		gerador.pressPreferencial();
		gerador.pressPreferencial();
		System.out.println(gerador);
		gerador.pressChamarCliente();
		gerador.pressChamarCliente();
		gerador.pressChamarCliente();

		System.out.println(gerador);




	}

}