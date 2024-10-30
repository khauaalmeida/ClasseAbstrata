package ClasseAbstrata;

public class Moto extends Veiculo {
	public Moto(String placa,String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	
}

@Override
public void acelerar() {
	System.out.println("A Moto está acelerando.");
}

@Override
public void frear() {
	System.out.println("A Moto está freando.");
}

@Override
public void virar() {
	System.out.println("A Moto está virando.");
}

@Override
public void ligar() {
	System.out.println("A Moto está ligado.");
}

}
