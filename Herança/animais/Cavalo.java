package animais;

public class Cavalo extends Animais{
	
	public Cavalo(String n, int i, String s) {
		super(n, i, s);
		// TODO Auto-generated constructor stub
	}

	public void cavalocorrer(){
		
		System.out.println("Cavalo est� correndo");
		
	}
	
	public void statuscavalo() {
		System.out.println("Informa��es do cavalo");
		System.out.println("Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom());
	}
}
