package ex_4;

import java.util.Scanner;

public class Ex_4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		double resto;

		System.out.print("Digite a idade: ");
		a = ler.nextInt();
		
		resto = a%2;
		if (resto==0) { resto = Math.sqrt(a);
			System.out.print("O n�mero "+a+" � par e possui raiz quadrada igual a "+resto); }
		else {resto = a*a;
		System.out.print("O n�mero "+a+" � �mpar e possui o quadrado igual a "+resto);}
			

	}
}
