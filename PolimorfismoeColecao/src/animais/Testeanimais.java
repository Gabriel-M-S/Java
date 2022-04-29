package animais;

public class Testeanimais {
	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro("Garu",11);
		Preguiça p1 = new Preguiça("Mat",5);
		Cavalo c2 = new Cavalo("Hamm",3);
		
		c1.cachorrocorrer();
		c1.emitirsom();
		c1.statuscachorro();
		
		c2.cavalocorrer();
		c2.emitirsom();
		c2.statuscavalo();
		
		p1.preguiçasubir();
		p1.emitirsom();
		p1.statuspreguiça();
		
		
	}
}
