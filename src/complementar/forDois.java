package complementar;

import java.util.Scanner;

public class forDois {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		//VARIAVEIS
		int impar =0, par =0;
		int num;
		
		//PROGRAM
		for(int i=0; i<10; i++) {
		System.out.println("\nDigite 10 numeros: ");
		num = l.nextInt();
		
		if(num % 2 == 0) {
			par += 1;
		}else {
			impar += 1;
		}
		}
		System.out.println(par +" são pares");
		System.out.println(impar +" são impares");

	}

}
