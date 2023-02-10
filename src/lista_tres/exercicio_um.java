package lista_tres;

import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {
		Scanner l =new Scanner (System.in);

		//VARIAVEIS
		int n1, n2, cont;
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = l.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = l.nextInt();
		
		if(n1 > n2) {
			System.out.println("\nOpção invalida");
		}else {
			for(cont = n1; cont < n2; cont ++) {
				if(cont % 7 == 0 || cont % 5 == 0 ) {
					System.out.printf("\n%i é multiplo de 5 e 7");
				}
			}
		}
		
	}

}
