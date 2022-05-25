package queue.examples.golfe;

import stack.base.ArrayStack;
import stack.base.Stack;

public class Golfe {
	private Stack<Carta> cartas = new ArrayStack<>();
	
	private Carta mesa;
	private Jogador bater;
	public Stack<Carta> getCartas() {
		return cartas;
	}
	
	public Golfe() {
	       java.util.List<Carta> lista = new java.util.ArrayList<>();
           
	       String[] naipe = new String[] {"Ouros", "Espadas", "Paus", "Copas"};
	       for (int j=0; j<4; j++) {
	              for (int i=1; i<=13; i++) {
	                     String valor = i + "";
	                     switch (i) {
							 case 1: valor = "A"; break;
							 case 11: valor = "J"; break;
							 case 12: valor = "Q"; break;
							 case 13: valor = "K";break;
	                     }
	                           
	                     lista.add(new Carta(valor, naipe[j]));
	              }
	       }
	       java.util.Collections.shuffle(lista);
	       
	       for(Carta carta: lista) {
	    	   cartas.push(carta);
	       }
	}
	
	
	public void iniciar( Jogador ...jogadores) {
		for(Jogador jogador : jogadores) {
			jogador.add(cartas.pop());
			jogador.add(cartas.pop());
			jogador.add(cartas.pop());
			jogador.add(cartas.pop());
		}
		this.mesa = cartas.pop();
	}
	
	public Carta getMesa() {
		return mesa;
	}
	
	public void trocarMesa(Carta nova) {
		this.mesa = nova;
	}
	
	public boolean turno(Jogador jogador) {
		if(this.bater == jogador) {
			return false;
		}
		Carta c = jogador.trocar(cartas.pop());
		if(c != null) {
			this.mesa = c;
		} else {
			this.mesa = jogador.trocar(cartas.pop());
			
			
		}
		
		if(this.bater == null) {
			if(jogador.querBater()) {
				this.bater = jogador;
			}
		}
		
		return true;
	}
	
	public Jogador getQuerBater() {
		return bater;
	}
	
	public Jogador getVitorioso(Jogador[] js) {
		int menor = Integer.MAX_VALUE;
		Jogador menorJ = null;
		
		for(Jogador j : js) {
			if(j.getPontuacao() < menor) {
				menor = j.getPontuacao();
				menorJ = j;
			}
		}
		
		return menorJ;
	}
	
}
