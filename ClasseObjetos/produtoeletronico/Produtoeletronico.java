package produtoeletronico;

public class Produtoeletronico {

	private String marca;
	private int memoria;
	private int versao;
	private int pre�o;
	
	public Produtoeletronico(String n, int i, int num, int d){
	
	marca = n;
	memoria = i;
	versao = num;
	pre�o = d;
		
	} 
	
	void apresentardados() {
		System.out.println("Marca do produto: "+ marca);
		System.out.println("Mem�ria do dispositivo: "+memoria+" Gb");
		System.out.println("Vers�o do dispositivo: "+versao+"� gera��o");
		System.out.println("Pre�o total: R$"+pre�o);
		
	}
	void atualizarproduto() {System.out.println("Produto de nova gera��o adquirido"); 
	versao++;
	pre�o = pre�o + 500;
	}
	
	void comprarmemoria() { System.out.println("Novo cart�o de mem�ria adquirido"); 
	memoria = memoria + 64;
	pre�o = pre�o + 200;
	}
}