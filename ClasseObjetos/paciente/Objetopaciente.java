package paciente;

import contabancaria.Contabancaria;

public class Objetopaciente {	public static void main(String[] args) {
	
	Paciente a1 = new Paciente("João",27,8,3);
	
	a1.aniversario();
	a1.examefeito();
	a1.apresentardados();
	
}

}
