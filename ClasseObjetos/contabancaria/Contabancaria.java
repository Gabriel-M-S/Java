package contabancaria;

public class Contabancaria {
	private String nome;
	private long numeroConta;
	private int pontoFidelidade;
	private double saldo;
	
	public Contabancaria(String n, long num, int i, double d) {
	
	nome = n;
	numeroConta = num;
	pontoFidelidade = i;
	saldo = d;
		
	} 
	
	void apresentardados() {
		System.out.println("Nome da conta: "+ nome);
		System.out.println("N�mero da conta: "+numeroConta);
		System.out.println("Pontos de fidelidade: "+pontoFidelidade);
		System.out.println("Saldo total: "+saldo);
}
	
	void sacar() { 
		saldo = saldo - 500;
		System.out.println("Houve o saque de R$500");
	}
	
	void converterpontofidelidade() { 
		saldo = saldo + 50;
		pontoFidelidade = pontoFidelidade - 500;
 		System.out.println("Houve a convers�o de 500 pontos em R$50");
 		
 		
	}
	
}
	
