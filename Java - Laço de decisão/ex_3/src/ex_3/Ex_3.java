package ex_3;

import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;

		System.out.print("Digite a idade: ");
		idade = ler.nextInt();

		if ((idade >= 10) && (14 >= idade))
			System.out.print("A idade pertene à categoria infantil.");
		else if ((idade >= 15) && (17 >= idade))
			System.out.print("A idade pertene à categoria juvenil.");
		else if ((idade >= 18) && (25 >= idade))
			System.out.print("A idade pertene à categoria adulto.");
		else
			System.out.print("A idade é inválida."); 
			

	}
}
