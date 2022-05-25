package queue.examples.golfe;

public class Carta {
	private String valor;
	private String naipe;
	
	public Carta(String valor, String naipe) {
		this.naipe = naipe;
		this.valor = valor;
	}
	
	
	public String getValor() {
		return this.valor;
	}
	
	public int getValorNumerico() {
		int v =0;
		switch(this.valor) {
		case "K": v = 0;break;
		case "A": v = 1;break;
		case "J": break;
		case "Q": v=10;break;
		default:
			v = Integer.parseInt(valor);
		}
		
		return v;
	}
	
	public String getNaipe() {
		return naipe;
	}
	
	@Override
	public String toString() {
		return valor+ " "+naipe;
	}
}
