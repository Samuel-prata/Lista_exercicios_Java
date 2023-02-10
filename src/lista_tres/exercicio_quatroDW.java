package lista_tres;

import java.util.Scanner;

public class exercicio_quatroDW {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		int num, soma = 0;
		
		//COMECO DO PROGRAMA
		do {
			
			System.out.println("\nDigite um numero: ");
			num = l.nextInt();
			 if(num > 0) {//CONDIÇÃO PARA VER SE O NUMERO É POSITIVO
				 soma += num;
			 }
			
			
		}while (num != 0);
		System.out.println("\nA soma dos números é: " +soma);
	}

}
