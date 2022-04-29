package ex_3;

	import java.io.PrintStream;
	import java.util.Scanner;

	public class Ex_3 {
		

		public static void main( String args[]) {              
			
			
		Scanner ler = new Scanner(System.in);
		int horas, minutos, segundos, total;
			
		System.out.println("Digite qual o tempo total do evento em segundos: ");
		total = ler.nextInt();
		
        horas = (total/60)/60;
        minutos = (total/60)%60;
        segundos = (total%60)%60;
		System.out.println("A duração foi de: "+horas+" horas, "+minutos+" minutos e "+ segundos+" segundos");
		


	}
	}
