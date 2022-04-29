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
		System.out.println("Avi�o ligado...");
	}
	
	void apresentardados() {
		System.out.println("Modelo do avi�o: "+ modelo);
		
		if(combustivel<30)
			System.out.println("Porcentagem de combust�vel no tanque: "+combustivel+"%\nTanque est� com volume baixo de combust�vel");
			else 
				System.out.println("Porcentagem de combust�vel no tanque: "+combustivel+"%\nTanque est� com volume adequado de combust�vel");
		
		System.out.println("Velocidade do avi�o: "+velocidade+" Km/s");
		System.out.println("Total de passageiros: "+passageiros);
		
	}
	
	void acelerar() { velocidade = velocidade + 10; 
	System.out.println("Avi�o atingiu nova velocidade ap�s acelera��o");}
	
}
