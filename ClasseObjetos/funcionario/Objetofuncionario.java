package funcionario;

import funcionario.Funcionario;

public class Objetofuncionario {

	public static void main(String[] args) {
		
		Funcionario a1 = new Funcionario("CEO",68,0.3,100000);
		
		a1.aumentosalarial();
		a1.diminuircargah();
		a1.apresentardados();
	}
	
	
	
	
}
