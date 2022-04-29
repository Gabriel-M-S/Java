package ex_4;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {

		int[][] MatA = new int[2][2];
		int[][] MatB = new int[2][2];
		int[][] MatC = new int[2][2];
		int som, x, c, b, s, k;
		som = 0;
		System.out.print("Dígite os valores da matriz A: ");
		for (x = 0; x < 2; x++) {
			for (c = 0; c < 2; c++) {
				Scanner ler = new Scanner(System.in);
				b = ler.nextInt();
				MatA[x][c] = b;
			}
		}
		System.out.print("Dígite os valores da matriz B: ");
		for (x = 0; x < 2; x++) {
			for (c = 0; c < 2; c++) {
				Scanner ler = new Scanner(System.in);
				b = ler.nextInt();
				MatB[x][c] = b;
			}
		}
		System.out.println("Dígite o número referente à operação que deseja realizar: ");
		Scanner ler = new Scanner(System.in);
		s = ler.nextInt();
		if (s == 1) {
			System.out.println("Matriz resultante da soma entre A e B: \n");
			for (x = 0; x < 2; x++) {
				for (c = 0; c < 2; c++) {

					MatC[x][c] = MatB[x][c] + MatA[x][c];
					System.out.print(MatC[x][c] + "\t");
				}
				System.out.print("\n");
			}
		} else if (s == 2) {
			System.out.println("Matriz resultante da subtração de A por B: \n");
			for (x = 0; x <2 ; x++) {
				for (c = 0;  c<2; c++) {

					MatC[x][c] = MatA[x][c] - MatB[x][c];
					System.out.print(MatC[x][c] + "\t");
				}
				System.out.print("\n");
			}
		} else if (s == 3) {
			System.out.println("Selecione o valor da constante: ");
			Scanner l = new Scanner(System.in);
			k = l.nextInt();

			System.out.println("Valor da Matriz A resultante: ");
			for (x = 0; x < 2; x++) {
				for (c = 0; c < 2; c++) {

					MatA[x][c] = MatA[x][c] + k;
					System.out.print(MatA[x][c] + "\t");
					MatB[x][c] = MatB[x][c] + k;
				}
				System.out.print("\n");
			}
			System.out.println("Valor da Matriz B resultante: ");
			for (x = 0; x < 2; x++) {
				for (c = 0; c < 2; c++) {
					System.out.print(MatB[x][c] + "\t");
				}
				System.out.print("\n");
			}
		} else if (s == 4) {
			System.out.println("Valor da Matriz A: ");
			for (x = 0; x < 2 ; x++) {
				for (c = 0; c < 2; c++) {
					System.out.print(MatA[x][c] + "\t");
				}
				System.out.print("\n");
			}
			System.out.println("Valor da Matriz B: ");
			for (x = 0; x < 2; x++) {
				for (c = 0; c < 2; c++) {
					System.out.print(MatB[x][c] + "\t");
				}
				System.out.print("\n");
			}
		} else {
			System.out.println("Comando do menu inválido");
		}
	}

}
