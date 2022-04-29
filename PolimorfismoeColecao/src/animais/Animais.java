package animais;

public abstract class Animais {

	String nome;
	int idade;
	
	
	public Animais(String n, int i){
		this.nome=n;
		this.idade=i;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void emitirsom(){
		
		System.out.println("Som do animal");
		

	}
}
