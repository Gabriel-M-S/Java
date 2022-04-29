package patinete;

public class Patinete{

	private String marca;
	private int velocidade;
	private int tempodeuso;
	private String dono;
	
	public Patinete(String n, int i, int e, String d){
	
	marca = n;
	velocidade = i;
	tempodeuso = e;
	dono = d;
		
	} 
	
	void apresentardados() {
		System.out.println("Marca: "+ marca);
		System.out.println("Velocidade: "+velocidade+" m/s");
		System.out.println("Tempo de uso total em anos sem manutenção: "+tempodeuso);
		if(tempodeuso>2) { System.out.println("Tempo de uso exige manutenção.");}
		System.out.println("Dono do equipamento: "+dono);
	}
	
	void acelerar() { velocidade = velocidade + 1;}
	
	void frear() {velocidade = velocidade - 1; }
	
	void manutencao() { tempodeuso = 0; }  
	
}