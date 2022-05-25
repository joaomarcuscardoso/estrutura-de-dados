package priorityQueue.examples.tabuleiro;



import priorityQueue.base.PriorityQueue;
import priorityQueue.base.UnsortedPriorityQueue;

import java.util.Comparator;
public class DistanciaManhattan {
	static class Ponto {
		
	
		private int x;
		private int y;
		private String nome;
		
		public Ponto(int x, int y, String nome) {
			this.x = x;
			this.y = y;
			this.nome = nome;
		}

		@Override
		public String toString() {
			return String.format("%s: {x: %d, y: %d}", nome, x, y); 
		}
	}
	
	public static void main(String[] args) {
		Ponto p00 = new Ponto(0,0, "Casa1");
		Ponto p30 = new Ponto(0,0, "Casa2");
		Ponto p02 = new Ponto(0,0, "Casa3");
		Ponto p33 = new Ponto(0,0, "Casa4");
		
		Ponto base = new Ponto(1,1, "Base");
		
		PriorityQueue<Ponto, Ponto> ps;
		
		ps = new UnsortedPriorityQueue<>(new ManhatanComparator(base));
		
		ps.insert(p00, p00);
		ps.insert(p30, p30);
		ps.insert(p02, p02);
		ps.insert(p33, p33);
		
		System.out.println(ps);
		
		System.out.println(ps.min().getKey());
		
		base.y = 3;
		System.out.println(ps.min().getKey());
	}
	
	static class ManhatanComparator implements Comparator<Ponto> {
		private Ponto base;

		public ManhatanComparator(Ponto base) {
			super();
			this.base = base;
		}

		@Override
		public int compare(Ponto o1, Ponto o2) {
			int o1Dist = Math.abs(o1.x - base.x)+ Math.abs(o1.y - base.y); 
			int o2Dist = Math.abs(o2.x - base.x)+ Math.abs(o2.y - base.y); 
			return o1Dist - o2Dist;
		}
	}
}
