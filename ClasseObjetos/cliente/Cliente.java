package cliente;

public class Cliente {

	private String nome;
	private int idade;
	private long numeroCartao;
	private double valorCompra;
	
	public Cliente(String n, int i, long num, double d) {
	
	nome = n;
	idade = i;
	numeroCartao = num;
	valorCompra = d;
		
	} 
	
	void apresentardados() {
		System.out.println("Nome do cliente: "+ nome);
		
		if(idade<18)
			System.out.println("Idade do cliente é: "+idade+"\nCliente menor de idade");
			else 
				System.out.println("Idade do cliente: "+idade+"\nCliente maior de idade");
		
		System.out.println("Número do cartão: "+ numeroCartao);
		System.out.println("Total da compra: "+valorCompra);
		
	}
	
	void aniversario() { 
		idade = idade + 1;
		System.out.println("Feliz Aniversário!");
				
	}
	
	void cartaoConfirmado() { numeroCartao = 332008123;
	System.out.println("Cartão aceito");
	}
	
	void debitoquitado() {valorCompra = 0; } 
}
