package ex_5;

import java.util.Scanner;

public class Ex_5 {
	public static void main(String[] args) {

		int digito, som;
som = 0;


do {
	
	System.out.println("Digite um valor (o dígito zero encerra o programa): ");
	Scanner ler = new Scanner(System.in);
	digito = ler.nextInt();
	som = som + digito; 
	
	
} while (digito != 0); 
		System.out.println("Soma dos números dígitados: "+som);


	}
}

	