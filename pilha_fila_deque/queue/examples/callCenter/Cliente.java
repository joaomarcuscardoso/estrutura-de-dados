package queue.examples.callCenter;

import java.util.Date;

public class Cliente {
	private String nome;
	private  long inicioAtendimento;
	private  long finalAtendimento;
	
	
	public Cliente(String nome) {
		this.nome=  nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIniciAtendimento(long inicioAtendimento) {
		this.inicioAtendimento =inicioAtendimento;
	}
	
	public void setFinalAtendimento(long finalAtendimento) {
		this.finalAtendimento = finalAtendimento;
	}
	
	public long getInicioAtendimento() {
		return this.inicioAtendimento;
	}
	
	public long getFinalAtendimento() {
		return this.finalAtendimento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", inicioAtendimento=" + inicioAtendimento + ", finalAtendimento="
				+ finalAtendimento + "]";
	}
}
