package animais;

public class Cachorro extends Animais{
	
	public Cachorro(String n, int i) {
		super(n, i);
		// TODO Auto-generated constructor stub
	}

	public void cachorrocorrer(){
		
		System.out.println("Cachorro está correndo");
		
	}
	
	public void statuscachorro() {
		System.out.println("Informações do cachorro");
		System.out.println("Nome cachorro: "+getNome()+"\n Idade: "+getIdade()+"\n Som do cachorro: Latido ");
	}
	
	@Override
	public void emitirsom() {
		
		System.out.println("Som do latido");
		
	}
}

