package produtoeletronico;

public class Produtoeletronico {

	private String marca;
	private int memoria;
	private int versao;
	private int preço;
	
	public Produtoeletronico(String n, int i, int num, int d){
	
	marca = n;
	memoria = i;
	versao = num;
	preço = d;
		
	} 
	
	void apresentardados() {
		System.out.println("Marca do produto: "+ marca);
		System.out.println("Memória do dispositivo: "+memoria+" Gb");
		System.out.println("Versão do dispositivo: "+versao+"º geração");
		System.out.println("Preço total: R$"+preço);
		
	}
	void atualizarproduto() {System.out.println("Produto de nova geração adquirido"); 
	versao++;
	preço = preço + 500;
	}
	
	void comprarmemoria() { System.out.println("Novo cartão de memória adquirido"); 
	memoria = memoria + 64;
	preço = preço + 200;
	}
}