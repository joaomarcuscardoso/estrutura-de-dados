package priorityQueue.examples.geradorSenhas;

import java.util.Comparator;

import priorityQueue.base.Entry;
import priorityQueue.base.SortedPriorityQueue;

public class GeradorSenhas { 
	public static class OrdenarFila implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			char c1 = s1.charAt(0);
			Integer n1 = Integer.parseInt(s1.substring(1));
			
			char c2 = s2.charAt(0);
			Integer n2 = Integer.parseInt(s2.substring(1));
			
			Integer retorno = 0;
			if(c1 == c2) {
				if(n1 > n2) {
					retorno = 1;
				} else {
					retorno = -1;
				}
			} else if(c1 == 'P' && c2 == 'N') {
				retorno = -1;
			} else {
				retorno = 1;
			}

		
			return retorno;
		}
	}
	private int numeroP = 0;
	private int numeroN = 0;
	private SortedPriorityQueue<String, String> fila = new SortedPriorityQueue<>(new OrdenarFila());

	
	
	public String pressNormal() {
		numeroN++;
		String letra = "N"+ numeroN;
		fila.insert(letra, letra);
		
		return letra;
	}
	public String pressPreferencial() {
		numeroP++;
		String letra = "P"+ numeroP;
		fila.insert(letra, letra);
		
		return letra;
	}

	public String pressChamarCliente() {
		if(fila.isEmpty()) {
			return null;
		}
		
		Entry<String, String> pessoaChamada = fila.min();
		
		fila.removeMin();
		
		return pessoaChamada.getValue();
	}
	@Override
	public String toString() {
		return  ""+fila.toString();
	}
	
	

}
