package ex_2;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {

		int x, par, impar, n;

		par = 0;
		impar = 0;
		for (x = 1; x <= 10; x++) {

			System.out.println("Digite um número: ");
			Scanner ler = new Scanner(System.in);

			n = ler.nextInt();

			if ((n % 2) == 0)
				par = par + 1;
			else
				impar = impar + 1;

		}
		
		System.out.println("Quantidade de números pares: "+ par);
		System.out.println("Quantidade de números ímpares: "+ impar);

	}
}

	