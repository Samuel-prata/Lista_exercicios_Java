package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class collection1 {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		ArrayList<String> ml = new ArrayList<>();
		String op;
		System.out.println("-------------------------LISTA DE CORES------------------------------");
		for(int i=0; i<5; i++) {
			System.out.println("\nDigite a cor: ");
			String cor = l.nextLine();
			ml.add(cor);
		
		}
		System.out.println("\nLista escrita");
		System.out.println(ml);
		
		ml.sort(null);
		System.out.println("\nLista depois de ordenada");
		System.out.println(ml);
	
	}

}
