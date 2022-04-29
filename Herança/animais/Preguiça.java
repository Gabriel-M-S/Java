package animais;

public class Preguiça extends Animais{
	
	public Preguiça(String n, int i, String s) {
		super(n, i, s);
		// TODO Auto-generated constructor stub
	}

	public void preguiçasubir(){
		
		System.out.println("Preguiça está subindo na árvore");
		
	}
	
	public void statuspreguiça() {
		System.out.println("Informações da preguiça");
		System.out.println("Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom());
	}
}