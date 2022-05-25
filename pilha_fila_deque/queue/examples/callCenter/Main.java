package queue.examples.callCenter;


import queue.base.ArrayQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atendente atendente1 = new Atendente(1);
		Atendente atendente2 = new Atendente(2);
		Atendente atendente3 = new Atendente(3);
		
		ArrayQueue<Atendente> atendentes = new ArrayQueue<>();
		atendentes.enqueue(atendente1);
		atendentes.enqueue(atendente2);
		atendentes.enqueue(atendente3);
		
		Cliente cliente1 = new Cliente("João");
		Cliente cliente2 = new Cliente("José");
		Cliente cliente3 = new Cliente("Antonio");
		
		ArrayQueue<Cliente> clientes = new ArrayQueue<>();
		clientes.enqueue(cliente1);
		clientes.enqueue(cliente2);
		clientes.enqueue(cliente3);

		CallCenter call1 = new CallCenter(clientes, atendentes);
		atendente1.atender(1);
		
		System.out.println(call1.toString());
		
		
	}

}
