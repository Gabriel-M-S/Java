package ex_2;

	import java.io.PrintStream;
	import java.util.Scanner;

	public class Ex_2 {
		

		public static void main( String args[]) {              
			
			
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total;
			
		System.out.println("Digite quantos dias você tem de idade no total: ");
		total = ler.nextInt();
		
		anos = total/365;
	    meses = (total%365)/28;
		dias = (total%365)%28;
		System.out.println("Você possui: "+anos+" anos, "+meses+" meses e "+ dias+" dias de idade");
		


	}
	}

