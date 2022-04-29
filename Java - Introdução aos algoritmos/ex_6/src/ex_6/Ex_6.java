package ex_6;

	import java.io.PrintStream;
	import java.util.Scanner;

	public class Ex_6 {
		

		public static void main( String args[]) {              
			
			
		Scanner ler = new Scanner(System.in);
		float A, B, C, D;
		double F;
			
		System.out.println("Digite o valor da primeira coordenada (x): ");
		A = ler.nextInt();
		System.out.println("Digite o valor da primeira coordenada (y): ");
		B = ler.nextInt();
		System.out.println("Digite o valor da segunda coordenada (x): ");
		C = ler.nextInt();
		System.out.println("Digite o valor da segunda coordenada (y): ");
		D = ler.nextInt();
		
		
		F = Math.sqrt((A-C)*(A-C)+(B-D)*(B-D));
		System.out.println("O valor da distância é: "+ F); }}