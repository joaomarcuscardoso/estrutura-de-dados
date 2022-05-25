package stack.examples.estacionamento;

public class TestEstacionamento {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Carro c1 = new Carro("AAA");
    Carro c2 = new Carro("BBB");
    Carro c3 = new Carro("CCC");
    Carro c4 = new Carro("DDD");
    Carro c5 = new Carro("EEE");
    Carro c6 = new Carro("FFF");
    Carro c7 = new Carro("GGG");
    Carro c8 = new Carro("HHH");
    Carro c9 = new Carro("III");
    Carro c10 = new Carro("JJJ");

    Estacionamento estacionamento = new Estacionamento();

    estacionamento.estacionar(c1);
    estacionamento.estacionar(c2);
    estacionamento.estacionar(c3);
    estacionamento.estacionar(c4);
    estacionamento.estacionar(c5);
    estacionamento.estacionar(c6);
    estacionamento.estacionar(c7);
    estacionamento.estacionar(c8);
    estacionamento.estacionar(c9);
    estacionamento.estacionar(c10);
    
    System.out.println(estacionamento.toString());
    
    estacionamento.sairDoEstacionamento(c1);
    System.out.println(estacionamento.toString());
    
    estacionamento.sairDoEstacionamento(c10);
    System.out.println(estacionamento.toString());
    
    estacionamento.sairDoEstacionamento(c5);
    System.out.println(estacionamento.toString());
    
  }
}
