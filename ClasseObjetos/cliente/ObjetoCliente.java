package cliente;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente p1 = new Cliente("Marisa",18,0, 199.90);
		
		p1.aniversario();
		p1.cartaoConfirmado();
		p1.apresentardados();
		p1.debitoquitado();
	}
	
	
	
	
}
