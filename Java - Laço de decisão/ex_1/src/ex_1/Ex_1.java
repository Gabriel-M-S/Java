package ex_1;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.print("Digite o primeiro d�gito: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo d�gito: ");
		b = ler.nextInt();
		System.out.print("Digite o segundo d�gito: ");
		c = ler.nextInt();

		if (a > b && a > c) {
			System.out.print("O primeiro d�gito de valor " + a + " � o maior");
		} else if (b > a && b > c) {
			System.out.print("O segundo d�gito de valor " + b + " � o maior");
		} else {
			System.out.print("O terceiro d�gito de valor " + c + " � o maior");
		}

	}
}
