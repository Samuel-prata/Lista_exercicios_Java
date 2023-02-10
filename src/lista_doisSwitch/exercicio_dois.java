package lista_doisSwitch;

import java.util.Scanner;

public class exercicio_dois {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		String nome;
		int cod;
		float sal, salReajuste, valReajuste;
		
		//COMEÇANDO PROGRAMA
		System.out.println("\nREAJUSTE DE SALÁRIOS");
		System.out.println("\nCodigo 1 - Gerente");
		System.out.println("\nCodigo 2 - Vendedor");
		System.out.println("\nCodigo 3 - Supervisor");
		System.out.println("\nCodigo 4 - Motorista");
		System.out.println("\nCodigo 5 - Estoquista");
		System.out.println("\nCodigo 6 - Técnico de TI");
		System.out.println("\nDigite o nome do funcionário: ");
		nome = l.next();
		System.out.println("\nDigite o código do cargo: ");
		cod = l.nextInt();
		System.out.println("\nDigite o salário Atual: ");
		sal = l.nextInt();
		
		switch (cod) {
		case 1: {
			valReajuste= sal * 10 /100;
			salReajuste = sal + valReajuste;
			System.out.printf("\nO O novo salário de %s será de R$ %.2f", nome, salReajuste);	
			break;
		}
		case 2: {
			valReajuste= sal * 7 /100;
			salReajuste = sal + valReajuste;
			System.out.printf("\nO O novo salário de %s será de R$ %.2f", nome, salReajuste);	
			break;
		}
		case 3: {
			valReajuste= sal * 9 /100;
			salReajuste = sal + valReajuste;
			System.out.printf("\nO O novo salário de %s será de R$ %.2f", nome, salReajuste);	
			break;
		}
		case 4: {
			valReajuste= sal * 6 /100;
			salReajuste = sal + valReajuste;
			System.out.printf("\nO O novo salário de %s será de R$ %.2f", nome, salReajuste);	
			break;
		}
		case 5: {
			valReajuste= sal * 5 /100;
			salReajuste = sal + valReajuste;
			System.out.printf("\nO O novo salário de %s será de R$ %.2f", nome, salReajuste);	
			break;
		}
		case 6: {
			valReajuste= sal * 8 /100;
			salReajuste = sal + valReajuste;
			System.out.printf("\nO O novo salário de %s será de R$ %.2f", nome, salReajuste);	
			break;
		}
		default:
			System.out.println("\nOpção invalida");
			break;
		}
	}

}
