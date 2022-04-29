package aviao;

public class Aviao {

	private String modelo;
	private int combustivel;
	private long velocidade;
	private int passageiros;
	
	public Aviao(String n, int i, int num, int d){
	
	modelo = n;
	combustivel = i;
	velocidade = num;
	passageiros = d;
		
	} 
	
	void ligaraviao() { 
		System.out.println("Avião ligado...");
	}
	
	void apresentardados() {
		System.out.println("Modelo do avião: "+ modelo);
		
		if(combustivel<30)
			System.out.println("Porcentagem de combustível no tanque: "+combustivel+"%\nTanque está com volume baixo de combustível");
			else 
				System.out.println("Porcentagem de combustível no tanque: "+combustivel+"%\nTanque está com volume adequado de combustível");
		
		System.out.println("Velocidade do avião: "+velocidade+" Km/s");
		System.out.println("Total de passageiros: "+passageiros);
		
	}
	
	void acelerar() { velocidade = velocidade + 10; 
	System.out.println("Avião atingiu nova velocidade após aceleração");}
	
}
