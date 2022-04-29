package ex_4;

	import java.io.PrintStream;
	import java.util.Scanner;

	public class Ex_4 {
		

		public static void main( String args[]) {              
			
			
		Scanner ler = new Scanner(System.in);
		int A, B, C;
		float R, S, D;
			
		System.out.println("Digite o valor de A: ");
		A = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		B = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		C = ler.nextInt();
		
		
		R=((A+B)*(A+B));
		S=((B+C)*(B+C));	
		D = (R+S)/2;
		System.out.println("O valor de D é: "+ D);
		


	}
	}
