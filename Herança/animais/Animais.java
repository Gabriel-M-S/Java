package animais;

public class Animais {

	String nome;
	int idade;
	String som;
	
	
	public Animais(String n, int i, String s){
		this.nome=n;
		this.idade=i;
		this.som=s;
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
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	public void emitirsom() {
		
		System.out.println(this.som);
		

	}
}
