package animais;

public class Testeanimais {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Garu",11,"Auau");
		Cavalo c2 = new Cavalo("Luigi",5,"iiirrrrí");
		Preguiça p1 = new Preguiça("Antony",3,"Aaaagh");
	
	c1.cachorrocorrer();
	c1.emitirsom();
	c1.statuscachorro();
	
	c2.cavalocorrer();
	c2.emitirsom();
	c2.statuscavalo();
	
	p1.emitirsom();
	p1.preguiçasubir();
	p1.statuspreguiça();
	
	}
	
}
