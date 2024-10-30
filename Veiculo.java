package ClasseAbstrata;

public abstract class Veiculo{
	
	
private String placa;
private String modelo;
private String cor;
private int ano;
	
	
public Veiculo (String placa, String modelo, String cor, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	
}
	
//Gerar Getters e Setters
	
public abstract void acelerar();

public abstract void frear();

public abstract void virar();

public abstract void ligar();


}


