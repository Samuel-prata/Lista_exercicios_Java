package lista_tres;

import java.util.Scanner;

public class exercicio_doisWhile {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);

		// VARIAVEIS
		int idade, maiorIdade = 0, menorIdade = 0;
		// programa
		System.out.println("\n\t\tIDADES");
		System.out.println("\nDigite 0 para começar : ");
		idade = l.nextInt();
		while (idade >= 0) {
			System.out.println("\nDigite a idade: ");
			idade = l.nextInt();
			// LAÇO PARA SEPARAÇÃO DE IDADES
			if (idade > 0 && idade < 21) {
				menorIdade++;// SABER QUANTAS PESSOAS SAO MENORES QUE 21
			}
			if (idade > 50 && idade < 100) {
				maiorIdade++;//SABER QUANTAAS SÃO MAIORES DE 50
			}
		}
		System.out.println("\nPessoas menores de 21: " + menorIdade);
		System.out.println("\nPessoas maiores de 50: " + maiorIdade);
		

	}

}