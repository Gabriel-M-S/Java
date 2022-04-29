package paciente;

public class Paciente {
	private String nome;
	private int idade;
	private int er;
	private int ep;
	
	public Paciente(String n, int num, int i, int d){
	
	nome = n;
	idade = num;
	er = i;
	ep = d;
		
	} 
	
	void apresentardados() {
		System.out.println("Nome do paciente: "+ nome);
		System.out.println("Idade: "+idade);
		System.out.println("Exames realizados: "+er);
		System.out.println("Exames pendentes: "+ep);
}
	
	void examefeito() { 
		ep = ep - 1;
		er = er + 1;
		System.out.println("Um exame foi realizado");
	}
	
	void aniversario() { 
		idade = idade + 1;
 		System.out.println("Feliz Aniversário!");
 		
}
}