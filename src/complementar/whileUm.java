package complementar;

import java.util.Scanner;

public class whileUm {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		int idade;
		int menos=0, mais=0;

		System.out.println("\nDigite a sua idade: ");
		idade = l.nextInt();
		
		while(idade!= -99) {
			
			System.out.println("\nDigite a sua idade: ");
			idade = l.nextInt();
			if(idade < 21) {
				menos += 1;
			}
			if(idade > 50) {
				mais+=1;
			}
		
		}
		System.out.println("\nNumero de pessoas menores de 21: "+menos);
		System.out.println("\nNumero de pessoas maiores de 50: "+mais);

	}

}
