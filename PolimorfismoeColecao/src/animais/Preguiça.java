package animais;

public class Pregui�a extends Animais{
	
	public Pregui�a(String n, int i) {
		super(n, i);
		// TODO Auto-generated constructor stub
	}

	public void pregui�asubir(){
		
		System.out.println("Pregui�a est� subindo na �rvore");
		
	}
	
	public void statuspregui�a() {
		System.out.println("Informa��es da pregui�a");
		System.out.println("Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: Grito da pregui�a ");
	}
	
	@Override
	public void emitirsom() {
		
		System.out.println("Som do grito da pregui�a");
		
	}
}