package queue.examples.callCenter;

import queue.base.ArrayQueue;

public class CallCenter {

	public ArrayQueue<Cliente> clientes = new ArrayQueue<>();
	public ArrayQueue<Atendente> atendente= new ArrayQueue<>();

	public CallCenter(ArrayQueue<Cliente> clientes, ArrayQueue<Atendente> atendente) {
		this.clientes = clientes;
		this.atendente = atendente;
	}
	@Override
	public String toString() {
		return "callCenter [clientes=" + clientes + ", atendente=" + atendente + "]";
	}
	
	
	
}
