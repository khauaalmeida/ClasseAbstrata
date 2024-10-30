package ClasseAbstrata;

public class Caminhao extends Veiculo {
    public Caminhao(String placa,String modelo, String cor, int ano) {
	super(placa, modelo, cor, ano);
	
}
    
    @Override
    public void acelerar() {
    	System.out.println("O Caminhao está acelerando.");
    }

    @Override
    public void frear() {
    	System.out.println("O Caminhao está freando.");
    }

    @Override
    public void virar() {
    	System.out.println("O Caminhao está virando.");
    }

    @Override
    public void ligar() {
    	System.out.println("O Caminhao está ligado.");
    }

    }
    


