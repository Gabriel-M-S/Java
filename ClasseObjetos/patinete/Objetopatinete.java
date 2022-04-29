package patinete;

import funcionario.Funcionario;

public class Objetopatinete {

		public static void main(String[] args) {
			
			Patinete a1 = new Patinete("Atrio",1,3,"João");
			
			a1.acelerar();
			a1.frear();
			a1.acelerar();
			a1.manutencao();
			a1.apresentardados();
		
}}
