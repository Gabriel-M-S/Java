package ex_1;

public class ex_1 {
	public static void main(String[] args) {

		int x, resto;

		for (x = 1000; x <= 1999; x++) {

			resto = x % 11;
			if (resto == 5)
				System.out.printf("\n %d", x);

		}

	}
	

	
}
