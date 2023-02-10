package lista_doisSwitch;

import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		int cod, unid ;
		float preco;
		
		//COMEÇO DO PROGRAMA

		System.out.println("\nLanchonete Família 60");
		System.out.println("\nCodigo 1 - Cachorro Quente - R$10,00");
		System.out.println("\nCodigo 2 - X-Salada - R$15,00");
		System.out.println("\nCodigo 3 - X-Bacon - R$18,00");
		System.out.println("\nCodigo 4 - Bauru - R$12,00");
		System.out.println("\nCodigo 5 - Refrigerante - R$8,00");
		System.out.println("\nCodigo 6 - Suco de Laranja - R$13,00");
		System.out.println("\nDigite o código do produto: ");
		cod = l.nextInt();
		System.out.println("\nDigite a quantidade de produtos: ");
		unid = l.nextInt();
		
		switch (cod) {
		case 1: {
			preco = unid * 10;
			System.out.printf("\nO valor total será de: %.2f", preco);	
			break;
		}
		case 2: {
			preco = unid * 15;
			System.out.printf("\nO valor total será de: %.2f", preco);
			break;
		}
		case 3: {
			preco = unid * 18;
			System.out.printf("\nO valor total será de: %.2f", preco);
			break;
		}
		case 4: {
			preco = unid * 12;
			System.out.printf("\nO valor total será de: %.2f", preco);
			break;
		}
		case 5: {
			preco = unid * 8;
			System.out.printf("\nO valor total será de: %.2f", preco);
			break;
		}
		case 6: {
			preco = unid * 13;
			System.out.printf("\nO valor total será de: %.2f", preco);
			break;
		}
		default:
			System.out.println("\nOpção invalida");
			break;
		}

	}

}
