package complementar;

import java.util.Scanner;

public class doWhileUm {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		int num, somaNum =0; 
		
		do {
			System.out.println("\nDigite um numero: ");
			num = l.nextInt();
			somaNum +=num;
		}while(num != 0);
		System.out.println("Soma dos números: "+somaNum);
	}

}
