package ex_2;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, maior, medio, menor, carrega;

		System.out.print("Digite o primeiro dígito: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo dígito: ");
		b = ler.nextInt();
		System.out.print("Digite o segundo dígito: ");
		c = ler.nextInt();

		if (a > b && a > c) {
			maior = a; medio=b; menor = c;
		} else if (b > a && b > c) {
			maior = b; medio=c; menor = a;
		} else {
			maior = c; medio=b; menor = a;
		}

		if (menor>medio) {    carrega = medio; medio = menor; menor = carrega;    }
		
		System.out.print("Os dígitos em ordem crescente: "+menor+", "+medio+", "+maior);
	
		
}
}
