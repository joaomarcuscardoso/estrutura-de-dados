package stack.examples.estacionamento;

import stack.base.ArrayStack;

public class Estacionamento {
	private ArrayStack<Carro> estacionamento = new ArrayStack<Carro>(10);

	public void estacionar(Carro c) {
		if(estacionamento.size() < 10) {
			estacionamento.push(c);
		} else {
			System.out.println("Estacionamento lotado.");
		}
	}
	
	public void sairDoEstacionamento(Carro c) {
		ArrayStack<Carro> fora = new ArrayStack<Carro>();

		while(!estacionamento.top().getPlaca().equals(c.getPlaca())) {
			if(!estacionamento.top().getPlaca().equals(c.getPlaca())) {
				estacionamento.top().addQtdManobras();
				fora.push(estacionamento.pop());
			} 
		}
		
		if(estacionamento.top().getPlaca().equals(c.getPlaca())) {
			estacionamento.pop();
			while(!fora.isEmpty()) {
				fora.top().addQtdManobras();
				estacionamento.push(fora.pop());
			}
		} 
	}

	@Override
	public String toString() {
		return "Estacionamento [\n" + estacionamento + "\n]";
	}
	
	
}
