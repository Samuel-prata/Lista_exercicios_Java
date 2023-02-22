package complementar;

import java.util.Scanner;

public class doWhileDois {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		int num, cont;
		int medNum =0;
		
		//PROGRAMa
		do {
			System.out.println("\nDigite um número ou (0) para sair: ");
			num = l.nextInt();
			if(num % 3 == 0) {
				medNum +=1;
			}
			
		}while(num!=0);
	}

}
