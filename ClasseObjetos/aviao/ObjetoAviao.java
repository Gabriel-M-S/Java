package aviao;

import aviao.Aviao;

public class ObjetoAviao {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao("Boeing 787-9 Dreamliner",65,200, 199);
		
		a1.ligaraviao();
		a1.acelerar();
		a1.apresentardados();
	}
	
	
	
	
}
