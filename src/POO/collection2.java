package POO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class collection2 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner (System.in);
		Set<Integer> primeiroSet = new HashSet<>();
		
		int esc;
		
		System.out.println("\nDigite 10 numeros: ");
		System.out.println("\nPs: Sem repetições!");
		for(int i=0; i<=10; i++) {
			System.out.print("\nNumero: ");
			int num = l.nextInt(); 
		primeiroSet.add(num);
		}
		
		for(Integer list : primeiroSet) {
			System.out.println("\nConteudo da lista..."+list);
		}
		
		Iterator<Integer> it = primeiroSet.iterator();
		System.out.println("\nDigite o numero escolhido:");
		esc = l.nextInt();
		
		if(primeiroSet.contains(esc)) {
			System.out.printf("\nO numero %i se encontra na posição %i", esc, primeiroSet);
		}else {
			System.out.println("Numero não encontrado!");
		}
		
	
	}

}
