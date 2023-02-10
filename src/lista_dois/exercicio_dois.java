package lista_dois;

import java.util.Scanner;

public class exercicio_dois {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIABLE
		int num, rest;
		
		System.out.println("\t\t IMPAR OU PAR || POSITIVO OU NEGATIVO ");
		System.out.print("\nDigite o número: ");
		num= l.nextInt();
		
		rest = num % 2;
		
		if(rest == 0 && num >= 0) {
			System.out.println("\nO numero é PAR e POSITIVO");
	}
		else if(rest == 0 && num < 0) {
			System.out.println("\nO numero é PAR e NEGATIVO");
	}
		else if(rest > 0 && num >= 0) {
			System.out.println("\nO numero é ÍMPAR e POSITIVO");
	}
		else if (rest > 0 || num < 0) {
			System.out.println("\nO número é ÍMPAR e NEGATIVO ");
		}
	}

}
