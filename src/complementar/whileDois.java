package complementar;

import java.util.Scanner;

public class whileDois {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		//VARIAVEIS
		int gen, idade, car, op, pesq =0;
		
		int nCalma =0, mNerv =0, hAgr=0, oCalmo =0,pNerMais =0, pCalMen =0;
		
		//PROGRAMA
		
		System.out.println("Digite (4) para continuar ou (5) para sair");
		op = l.nextInt();
		
		while(op!=5 || pesq==150) {
		System.out.println("\nBem vindo ao questionário de Mentalidade");
		System.out.println("\nDigite sua idade: ");
		idade = l.nextInt();
		System.out.println("Digite seu genero: ");
		System.out.println("(1) Feminino");
		System.out.println("(2) Masculino");
		System.out.println("(3) Outros");
		gen = l.nextInt();
		System.out.println("\nCaracteristica de personalidade");
		System.out.println("(1) Pessoa calma");
		System.out.println("(2) Pessoa nervosa");
		System.out.println("(3) Pessoa agressiva");
		car = l.nextInt();
		
		if(car == 3) {
			nCalma += 1;
		}
		if(gen==3 && car ==1) {
			oCalmo +=1;
		}
		if(gen == 1 && car == 2) {
			mNerv += 1;
		}
		if(gen == 2 && car == 3 ) {
			hAgr += 1;
		}
		if(car == 2 && idade > 40) {
			pNerMais += 1;
		}
		if(car == 1 && idade < 18) {
			pCalMen += 1;
		}
		pesq++;
		System.out.println("Digite (4) para continuar ou (5) para sair");
		op = l.nextInt();
		
		}
		
		System.out.println("Numero de pessoas calmas: "+ nCalma);
		System.out.println("Numero de mulheres nervosas: "+ mNerv);
		System.out.println("Numero de homens agressivos: "+ hAgr);
		System.out.println("Numero de pessoas nervosas com mais de 40 anos: "+ pNerMais);
		System.out.println("Numero de pessoas calmas menores de 18: "+ pCalMen);

	}

}
