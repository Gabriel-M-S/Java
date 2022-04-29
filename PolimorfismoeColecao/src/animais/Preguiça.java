package animais;

public class Preguiça extends Animais{
	
	public Preguiça(String n, int i) {
		super(n, i);
		// TODO Auto-generated constructor stub
	}

	public void preguiçasubir(){
		
		System.out.println("Preguiça está subindo na árvore");
		
	}
	
	public void statuspreguiça() {
		System.out.println("Informações da preguiça");
		System.out.println("Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: Grito da preguiça ");
	}
	
	@Override
	public void emitirsom() {
		
		System.out.println("Som do grito da preguiça");
		
	}
}