package ex_3;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		
		int[][] MatA =  new int[3][3];
		int som,x,c,b;
		som=0;
		 System.out.println("Dígite os valores da matriz: ");
		for(x=0;x<3;x++) {
			for(c=0;c<3;c++) {
				Scanner ler = new Scanner(System.in);
				 b = ler.nextInt();
				 MatA[x][c]=b;
					if(b>10)
						som++;}}
		 System.out.println("Quantidade de números maiores que 10 dígitados: "+som);
			}
		
			
	
	}