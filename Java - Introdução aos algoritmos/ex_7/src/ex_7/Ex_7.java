package ex_7;

	import java.io.PrintStream;
	import java.util.Scanner;

	public class Ex_7 {
		

		public static void main( String args[]) {              
			
			
		Scanner ler = new Scanner(System.in);
		float A, B, C, D, E, F, X, Y;
			
		System.out.println("Digite o valor dos coeficientes a, b, c, d, e e f: ");
		A = ler.nextInt();
		B = ler.nextInt();
		C = ler.nextInt();
		D = ler.nextInt();
		E = ler.nextInt();
		F = ler.nextInt();
		
		  X = (C*E-B*F)/(A*E-B*D);
		  Y = (A*F-C*D)/(A*E-B*D);
		  
		System.out.println("O valor é X= : "+ X+" e Y = "+Y); }}


