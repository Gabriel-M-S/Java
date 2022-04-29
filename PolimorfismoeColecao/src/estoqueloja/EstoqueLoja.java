package estoqueloja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		int c;
		
		
		List<String> estoque = new ArrayList<String>();
		
		do{	
			
			System.out.println("Digite 1 para armazenar dados no estoque, 2 para remover dados no estoque, 3 atualizar dados no estoque, 4 para apresentar todos os dados no estoque e qualquer outra tecla para sair do programa: ");
			Scanner i = new Scanner(System.in);
		     c = i.nextInt();
			
			if (c==1) {
				System.out.println("Digite o item que será adicionado: ");
				Scanner z = new Scanner(System.in);
				String o = z.next();
				estoque.add(o);
			}
			else if (c==2) {
				System.out.println("Digite o número do endereço do que será removido (0,1,2...): ");
				Scanner x = new Scanner(System.in);
			     int a = x.nextInt();
				estoque.remove(a);
			}
			else if (c==3) {
				System.out.println("Digite o número do endereço do que será trocado (0,1,2...) e, em seguida, digite o que será colocado no lugar: ");
				Scanner h = new Scanner(System.in);
			     int a = h.nextInt();
				Scanner b = new Scanner(System.in);
				String l = b.next();
				estoque.remove(a);
				estoque.add(a, l);
				}
				else if (c==4) {
					
					System.out.println("Itens no estoque: ");
					System.out.println(estoque);}
		
				} while ((c==1) || (c==2) || (c==3) || (c==4));
			
			}

		
		
		}

