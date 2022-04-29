package ex_6;

import java.util.Scanner;

public class Ex_6 {
	public static void main(String[] args) {

		int media, digito, n, s;
media = 0;
n = 0;
s = 0;

System.out.println("Digite um valor (o dígito zero encerra o programa): ");
Scanner ler1 = new Scanner(System.in);
digito = ler1.nextInt();	
do{
	if((digito%3)==0) {
	s = s + digito; 
	n = n + 1;}
	System.out.println("Digite um valor (o dígito zero encerra o programa): ");
	Scanner ler = new Scanner(System.in);
	digito = ler.nextInt();	
}while (digito != 0);

media = (s/n);
System.out.println("Média: "+(media));
		

	}
}

	