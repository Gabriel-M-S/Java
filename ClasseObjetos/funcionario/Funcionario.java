package funcionario;

public class Funcionario {

	private String cargo;
	private int cargah;
	private double performance;
	private long salario;
	
	public Funcionario(String n, int i, double e, long d){
	
	cargo = n;
	cargah = i;
	performance = e;
	salario = d;
		
	} 
	
	void apresentardados() {
		System.out.println("Cargo: "+ cargo);
		System.out.println("Carga hor�ria do funcion�rio: "+cargah+"h por semana");
		if(performance>0)
			System.out.println("Performance melhorou em "+(performance*100)+"%");
		else if(performance==0)
				System.out.println("Performance permanceu a mesma");
		else
				System.out.println("Performance melhorou em "+(performance*(-100))+"%");
		System.out.println("Salario total por m�s: R$"+salario);
		
	}
	
	void aumentosalarial() {
		
		salario = 10000 + salario;
		System.out.println("Promo��o de R$10000");
	}
	
	void diminuircargah() {
		System.out.println("Carga hor�ria semanal reduzida");
		cargah = cargah - 1;
		
	}
	
}