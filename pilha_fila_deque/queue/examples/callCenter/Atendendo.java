package queue.examples.callCenter;

public class Atendendo {
	private int numeroAtendente;
	private String nomeDoCliente;
	private long inicioDoAtendimento;
	private long finalDoAtendimento;
	
	
	
	public Atendendo(int numeroAtendente, String nomeDoCliente, long inicioDoAtendimento) {
		this.numeroAtendente = numeroAtendente;
		this.nomeDoCliente = nomeDoCliente;
		this.inicioDoAtendimento = inicioDoAtendimento;
	}
	public int getNumeroAtendente() {
		return numeroAtendente;
	}
	public void setNumeroAtendente(int numeroAtendente) {
		this.numeroAtendente = numeroAtendente;
	}
	
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	public long getInicioDoAtendimento() {
		return inicioDoAtendimento;
	}
	public void setInicioDoAtendimento(long inicioDoAtendimento) {
		this.inicioDoAtendimento = inicioDoAtendimento;
	}
	public long getFinalDoAtendimento() {
		return finalDoAtendimento;
	}
	public void setFinalDoAtendimento(long finalDoAtendimento) {
		this.finalDoAtendimento = finalDoAtendimento;
	}
	
	@Override
	public String toString() {
		return "atendente "+numeroAtendente+", nome do cliente "+nomeDoCliente+ ", inicio do atendimento: "+inicioDoAtendimento+" final do atendimento: "+finalDoAtendimento;
	}
	
}
