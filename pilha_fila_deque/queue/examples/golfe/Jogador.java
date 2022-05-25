package queue.examples.golfe;

import java.util.Comparator;

import priorityQueue.base.PriorityQueue;
import priorityQueue.base.SortedPriorityQueue;

public class Jogador {
	private static class MyComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			o1 = 10 - o1;
			o2 = 10 - o2;
			return o1- 02;
		}
		
	}
	
	private PriorityQueue<Integer, Carta> mao = new SortedPriorityQueue<>(new MyComparator());
	private int limiteParaBater;
	private int valorAtual;
	private int id;
	public Jogador(int id, int limiteParaBater) {
		this.limiteParaBater = limiteParaBater;
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public void add(Carta carta) {
		mao.insert(carta.getValorNumerico(), carta);
		valorAtual += carta.getValorNumerico();
	}
	
	public Carta querMesa(Carta mesa) {
		if(mesa.getValorNumerico() < mao.min().getValue().getValorNumerico()) {
			Carta c = mao.removeMin().getValue();
			valorAtual = valorAtual - c.getValorNumerico() + mesa.getValorNumerico();
			mao.insert(mesa.getValorNumerico(), mesa);
			return c;
		} else {
			return null;
		}
	}
	
	public Carta trocar(Carta carta) {
		if(carta.getValorNumerico() < mao.min().getValue().getValorNumerico()) {
			Carta c = mao.removeMin().getValue();
			mao.insert(carta.getValorNumerico(), carta);
			valorAtual= valorAtual - c.getValorNumerico() + carta.getValorNumerico();
			return c;
		} else {
			return carta;
		}
	}
	
	public boolean querBater() {
		return valorAtual <= limiteParaBater;
	}
	
	public String toString() {
		return id + " "+ valorAtual+ " "+mao;
	}
	
	public int getPontuacao() {
		return valorAtual;
	}
}
