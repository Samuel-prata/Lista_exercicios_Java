package lista_tres;

import java.util.Scanner;

public class segWhile {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		int idade, sexo, cat ;
		int nBack = 0, nFront = 0, mob = 0, full =0;
		String nome;
		String op = "s";
		//PROGRAMA
		
		
		while(!op.equals("n")) {
			System.out.println("\nDigite seu nome: ");
			nome = l.next();
			System.out.println("\nDigite sua idade: ");
			idade = l.nextInt();
			System.out.print("\n\t1 == Backend");
			System.out.print("\n\t2 == Frontend");
			System.out.print("\n\t3 == Mobile");
			System.out.println("\n\t4 == FullStack");
			System.out.println("\nDigite O código da sua categoria: ");
			cat = l.nextInt();
			System.out.print("\n\t1 == Masculino");
			System.out.print("\n\t2 == Feminino");
			System.out.println("\n\t3 == Outros");
			System.out.println("\nQual o sexo: ");
			sexo = l.nextInt();
			
			//condições para separar cargos
			if(cat == 1) {
				nBack++;
			}else if(cat == 2 && sexo == 2) {
				nFront++;
			}else if(cat == 3 && sexo == 1 && idade > 40) {
				mob++;
			} if(cat == 4 && sexo == 2 && idade < 30) {
				full++;
			}
			
			System.out.print("\n\t === MENU ===");
			System.out.print("\n\tDeseja continuar o programa ?");
			System.out.print("\nDigite (s) para sim e (n) para não: ");
			op = l.next();
			
		}
		System.out.print("\nNumero de pessoas desenvolvedoras BackEnd: " + nBack);
		System.out.print("\nNumero de mulheres desenvolvedoras FrontEnd: " + nFront);
		System.out.print("\nNumero de homens desenvolvedores Mobile maiores de 40 anos: " + mob);
		System.out.print("\nNumero de pessoas desenvolvedoras FullStack menores de 30 anos: " + full);
		
		
		
		

	}

}
