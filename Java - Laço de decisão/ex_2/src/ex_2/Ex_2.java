package ex_2;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, maior, medio, menor, carrega;

		System.out.print("Digite o primeiro d�gito: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo d�gito: ");
		b = ler.nextInt();
		System.out.print("Digite o segundo d�gito: ");
		c = ler.nextInt();

		if (a > b && a > c) {
			maior = a; medio=b; menor = c;
		} else if (b > a && b > c) {
			maior = b; medio=c; menor = a;
		} else {
			maior = c; medio=b; menor = a;
		}

		if (menor>medio) {    carrega = medio; medio = menor; menor = carrega;    }
		
		System.out.print("Os d�gitos em ordem crescente: "+menor+", "+medio+", "+maior);
	
		
}
}
