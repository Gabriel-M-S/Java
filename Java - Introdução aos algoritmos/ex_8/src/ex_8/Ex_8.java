package ex_8;

	import java.io.PrintStream;
	import java.util.Scanner;

	public class Ex_8 {
		

		public static void main( String args[]) {              
			
			
		Scanner ler = new Scanner(System.in);
		float F, C;
			
		System.out.println("Digite o valor do custo de fábrica: ");
		C = ler.nextInt();
		
		F = (float) (C+C*0.28+C*0.45);
		
		System.out.println("O valor do custo final do carro é: R$"+ F); }}
