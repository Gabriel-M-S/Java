package ex_1;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.print("Digite o primeiro dígito: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo dígito: ");
		b = ler.nextInt();
		System.out.print("Digite o segundo dígito: ");
		c = ler.nextInt();

		if (a > b && a > c) {
			System.out.print("O primeiro dígito de valor " + a + " é o maior");
		} else if (b > a && b > c) {
			System.out.print("O segundo dígito de valor " + b + " é o maior");
		} else {
			System.out.print("O terceiro dígito de valor " + c + " é o maior");
		}

	}
}
