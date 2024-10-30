package ClasseAbstrata;

public class Onibus extends Veiculo {
	
	public Onibus(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println("O Ônibus está acelerando.");
	}
	
	@Override
	public void frear() {
		System.out.println("O Ônibus está freando.");
	}
	
	@Override
	public void virar() {
		System.out.println("O Ônibus está virando.");
	}
	
	@Override
	public void ligar() {
		System.out.println("O Ônibus está ligado.");
	}

}
