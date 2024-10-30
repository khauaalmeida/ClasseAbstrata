package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {
	    
		
		Carro ferrari = new Carro("00000","F1","Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("------------------------------");
		
		Onibus marcopolo = new Onibus("11111","XBL","prata",2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("------------------------------");
		
		Moto honda = new Moto("22222", "biz" , "branco" ,2022);
		honda.ligar();
		honda.acelerar();
		honda.virar();
		honda.frear();
		
		System.out.println("------------------------------");
		
		Caminhao scania = new Caminhao("33333", "carreta" , "vermelho" ,2022);
		scania.ligar();
		scania.acelerar();
		scania.virar();
		scania.frear();
		
	}

}
