package lista_dois;

import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);

		//VARIABLES
		int a, b, c, soma;
		
		//STARTING PROGRAM
		System.out.print("\nDigite o número A: ");
		a = l.nextInt();
		
		System.out.print("\nDigite o número B: ");
		b = l.nextInt();
		
		System.out.print("\nDigite o número C: ");
		c = l.nextInt();
		
		//CALCULO
		soma = a + b;
		
		//LAÇO CONDICIONAL
		if(soma > c) {
			System.out.println("\n\t\tA soma de A e B É MAIOR que C");
		}
		else if(soma < c) {
			System.out.println("\n\t\tA soma de A e B É MENOR que C");
		}
		else if(soma == c) {
			System.out.println("\n\t\tA soma de A e B é IGUAL a C");
		}

	}

}
