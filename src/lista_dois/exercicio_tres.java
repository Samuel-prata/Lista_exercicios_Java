package lista_dois;

import java.util.Scanner;

public class exercicio_tres {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIABLES
		String nome;
		int idade;
		boolean resp;
		
		
		
		//STARTING PROGRAM
		System.out.println("\t\t DOAÇÃO DE SANGUE");
		System.out.print("Por favor, digite seu nome: ");
		nome = l.nextLine();
		
		System.out.print("\nAgora, digite sua idade: ");
		idade = l.nextInt();
		
		if(idade < 18 || idade > 69  ) {
			System.out.println("\nVocê não esta apto a doar");
		}
		
		else if(idade >= 18 && idade < 60 ) {
			System.out.println("\nVoce está apto para doar");
		}
		else if(idade >= 60 && idade <= 69) {
			System.out.print("\nEssa é sua primeira vez doando sangue ? use (true) para sim e (false) para nao: ");
			resp = l.nextBoolean();
			
				if (resp) {
				System.out.println("\nVocê não esta apto a doar");
					}
						else {
				System.out.println("\nVocê está apto a doar");
							}
		}

	}

}
