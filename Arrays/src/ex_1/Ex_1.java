package ex_1;

public class Ex_1 {

	public static void main(String[] args) {
		
		int[] VetA = {1,0,5,-2,-5,7};
		int soma, x;
		
		soma = VetA[0]+VetA[1]+VetA[5];
		
	     System.out.println("Soma das variáveis de posição 1, 2 e 6 do vetor: "+soma);

	     VetA[3]=100;
	     
	     System.out.println("\nValores dentro do vetor A: ");
	     
	     for(x=0;x<6;x++) 
	    	  System.out.println(VetA[x]);
	    	 
	    	 
	     
	     
		}
		
		
		
		
	}
	

