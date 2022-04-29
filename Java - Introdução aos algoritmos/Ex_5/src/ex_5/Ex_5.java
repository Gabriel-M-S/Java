package ex_5;

	import java.io.PrintStream;
	import java.util.Scanner;

	public class Ex_5 {
		

		public static void main( String args[]) {              
			
			
		Scanner ler = new Scanner(System.in);
		float A, B, C, F;
			
		System.out.println("Digite o valor da nota 1: ");
		A = ler.nextInt();
		System.out.println("Digite o valor da nota 2: ");
		B = ler.nextInt();
		System.out.println("Digite o valor da nota 3: ");
		C = ler.nextInt();
		
		
		F = (float) (A*0.2+B*0.3+C*0.5);
		System.out.println("O valor da média final é: "+F);
		


	}
	}