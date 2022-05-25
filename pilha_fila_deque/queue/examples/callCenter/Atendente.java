package queue.examples.callCenter;

import java.util.ArrayList;
import java.util.List;

import queue.base.ArrayQueue;

public class Atendente {
	private int numero;
	public ArrayQueue<Cliente> atendimento = new ArrayQueue<>();
	private List<Atendendo> atendenteAtendendo = new ArrayList<>();
	
	
	public Atendente(int numero) {
		this.numero = numero;
	}
	
	public void addCliente(Cliente c) {
		atendimento.enqueue(c);
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	
	public String atender(int funcionarioAtender ) {
		if(!atendimento.isEmpty()) {
			
		
		
		Cliente c = atendimento.dequeue();
		
		c.setIniciAtendimento(System.currentTimeMillis());
		Atendendo atendendo = new Atendendo(funcionarioAtender, c.getNome(), c.getInicioAtendimento());
		atendenteAtendendo.add(atendendo);
		
		return atendendo.toString();
		} 
		return null;
	}
	
	
	public String terminarAtendimento(int funcionarioQEstaAtendendo) {
		for (Atendendo atendendo : atendenteAtendendo) {
			if(atendendo.getNumeroAtendente() == funcionarioQEstaAtendendo) {
				atendendo.setFinalDoAtendimento(System.currentTimeMillis());
				return atendendo.toString();
			}
		}
		
		return null;
	}


	@Override
	public String toString() {
		return "Atendente [numero=" + numero + ", atendimento=" + atendimento.toString() + ", atendenteAtendendo="
				+ atendenteAtendendo + "]";
	}
	
	
	
}
