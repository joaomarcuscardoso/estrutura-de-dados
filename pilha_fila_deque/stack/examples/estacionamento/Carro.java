package stack.examples.estacionamento;

public class Carro {
	private String placa;
	private int qtdManobras= 0;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getQtdManobras() {
		return qtdManobras;
	}
	public void addQtdManobras() {
		this.qtdManobras++;
	}

	public Carro(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", qtdManobras=" + qtdManobras + "]\n";
	}

	
}
