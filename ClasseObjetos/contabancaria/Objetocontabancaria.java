package contabancaria;

import patinete.Patinete;

public class Objetocontabancaria {
	
	public static void main(String[] args) {
		
		Contabancaria a1 = new Contabancaria("João",123456,2000,1000000);
		
		a1.sacar();
		a1.converterpontofidelidade();
		a1.apresentardados();
}}
