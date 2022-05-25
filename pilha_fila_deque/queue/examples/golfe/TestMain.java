package queue.examples.golfe;

public class TestMain {
	public static void main(String[] args) {
		Golfe golfe = new Golfe();
		Jogador[] js = new Jogador[] {
				new Jogador(1,5),
				new Jogador(2,8),
				new Jogador(3,11)
		};
		
		golfe.iniciar(js);
		
		System.out.println("Carta na Mesa "+ golfe.getMesa());
		
		System.out.println("Cartas do Jogador 1 (antes de comprar )");
		
		System.out.println(js[0]);
		
		int circular = 0;
		
		while(golfe.turno(js[circular])) {
			if(golfe.getQuerBater() != null) {
				System.out.println(">>> Jogador quer bater "+golfe.getQuerBater().getId());
				
			}
			
			System.out.println("CAratas do Jogador " + (circular + 1) + " depois de comprar)");
			System.out.println(js[circular]);
			System.out.println("\n Cartas na Mesa "+  golfe.getMesa());
			
			circular= (circular+1) %3;
			
			System.out.println("Cartas do jogador " + (circular + 1) + "(antes de comprar)");
			
			System.out.println(js[circular]);
		}
		
		System.out.println(golfe.getVitorioso(js));
	}
}
