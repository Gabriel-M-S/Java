package ex_1;

import java.io.PrintStream;
import java.util.Scanner;

public class Ex_1 {
	

	public static void main( String args[]) {              
		
		
	Scanner ler = new Scanner(System.in);
	int anos, meses, dias, total;
		
	System.out.println("Digite quantos anos voc� tem de idade: ");
	anos = ler.nextInt();
	System.out.println("Digite quantos meses voc� tem de idade: ");
	meses = ler.nextInt();	
	System.out.println("Digite quantos dias voc� tem de idade: ");
	dias = ler.nextInt();
	
	total = anos*365+meses*28+dias;
	System.out.println("Voc� possui: "+total+" dias de idade no total");
	

	}

}
