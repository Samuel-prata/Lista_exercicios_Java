package lista_tres;

import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		int num, par = 0, impar = 0, cont;
		//RECEBENDO NUMEROS
		for (cont = 1; cont <= 10; cont++) {
			System.out.println("Digite o número: ");
			num = l.nextInt();
			if(num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("\nNumeros pares: " +par);
		System.out.println("\nNumero immpar: "+impar);
		
	
		
		
		//LAÇO
		
		
	}

	}


