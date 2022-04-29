package ex_4;

import java.util.Scanner;

public class ex_4 {
	public static void main(String[] args) {

		int idade, sexo, temperamento, cont, pc,mn,ha,oc,pnq,pcd;
		pc = 0;
		mn = 0;
		ha = 0;
		oc = 0;
		pnq = 0;
		pcd = 0;
		
cont = 0;
System.out.println("Digite a idade: ");
Scanner ler = new Scanner(System.in);
idade = ler.nextInt();

System.out.println("Digite a sexo (1-feminino / 2-masculino / 3-Outros): ");
Scanner ler1 = new Scanner(System.in);
sexo = ler1.nextInt();

System.out.println("Digite o temperamento (1 - calmo; 2 - nervoso e 3 - agressivo): ");
Scanner ler2 = new Scanner(System.in);
temperamento = ler2.nextInt();

		while (cont != 150) {

			if (temperamento == 1) 
				pc = 1 + pc;
			if(sexo == 1 && temperamento ==2)
				mn = mn + 1;
			if(sexo == 2 && temperamento == 3)
				ha = ha + 1;
			if(sexo == 3 && temperamento == 1)
				oc = oc + 1;
			if(idade> 40 && temperamento == 2)
				pnq = pnq + 1;
			if(idade< 18 && temperamento == 1)
				pcd = pcd + 1;
			
			cont = cont + 1;
			System.out.println("Digite a idade: ");
			Scanner ler3 = new Scanner(System.in);
			idade = ler3.nextInt();

			System.out.println("Digite a sexo (1-feminino / 2-masculino / 3-Outros): ");
			Scanner ler4 = new Scanner(System.in);
			sexo = ler4.nextInt();

			System.out.println("Digite o temperamento (1 - calmo; 2 - nervoso e 3 - agressivo): ");
			Scanner ler5 = new Scanner(System.in);
			temperamento = ler5.nextInt();
		}
		
		System.out.println("Pessoas calmas: "+pc);
		System.out.println("Mulheres nervosas: "+mn);
		System.out.println("Homens agressivos: "+ha);
		System.out.println("Outros calmos: "+oc);
		System.out.println("Pessoas nervosas com mais de cinquenta anos: "+pnq);
		System.out.println("Pessoas calmas com menos de dezoito anos: "+pcd);
	
	
	}}