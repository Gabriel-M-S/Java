package ex_2;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		int[] VetA =  new int[6];
		int[] VetB =  new int[6];
		int soma, x,c,k,b;
		c=0;
		k=0;
		soma=0;
		 System.out.println("D�gite os valores do vetor: ");
		for(x=0;x<6;x++) {
			
			Scanner ler = new Scanner(System.in);
			b = ler.nextInt();
			if((b%2)==0) { 
				
				VetA[c]=b;
				c++;
				soma = b + soma;
			}
			else {
				VetB[k]=b;
				k++;
			}
			
		}
		
		 System.out.println("\nValores pares: ");
		for(x=0;x<c;x++) {
	     System.out.println("\n"+VetA[x]);
		}
		 System.out.println("\nSoma dos pares d�gitados no vetor: "+soma);
		 
		 System.out.println("\nValores �mpares: ");
			for(x=0;x<k;x++) {
		     System.out.println("\n"+VetB[x]);
			}
			 System.out.println("\nQuantidade de n�meros �mpares d�gitados: "+k);
	}}