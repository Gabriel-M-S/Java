package ex_3;

import java.util.Scanner;

public class ex_3 {
	public static void main(String[] args) {

		int idade, menor, maior;
menor = 0;
maior = 0;
System.out.println("Digite a idade: ");
Scanner ler = new Scanner(System.in);

idade = ler.nextInt();
		while (idade != -99) {

			if (idade<21 && idade>0) 
				menor = 1 + menor;
			else if(idade>50)
				maior = maior + 1;
			
			
			System.out.println("Digite a idade: ");
			Scanner ler1 = new Scanner(System.in);

			idade = ler1.nextInt();

		}
		
		System.out.println("Quantidade de pessoas com menos de 21 anos: "+ menor);
		System.out.println("Quantidade de pessoas com mais de 50 anos: "+ maior);

	}
}

	