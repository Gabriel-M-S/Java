package animais;

public class Cavalo extends Animais{
	
	public Cavalo(String n, int i) {
		super(n, i);
		// TODO Auto-generated constructor stub
	}

	public void cavalocorrer(){
		
		System.out.println("Cavalo está correndo");
		
	}
	
	public void statuscavalo() {
		System.out.println("Informações do cavalo");
		System.out.println("Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: Relincho ");
	}
	
	public void emitirsom() {
		
		System.out.println("Som do relincho");
		
	}
}
