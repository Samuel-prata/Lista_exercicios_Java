package POO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class filaUm {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		Scanner l = new Scanner (System.in);
		
		//VARIAVEl
		String nome;
		int op;
		
		while(true) {
		System.out.println("               Bem vindo!               ");
		System.out.println("----------------------------------------");
		System.out.println("      1.Adicionar cliente na fila       ");
		System.out.println("      2.Listar cliente na fila          ");
		System.out.println("      3.Retirar cliente na fila         ");
		System.out.println("      0.Sair                            ");
		System.out.println("----------------------------------------");
		System.out.println("Digite a opção:                         ");
		
		op =l.nextInt();
		
		if(op == 0) {
			System.out.println("\nObrigado por utilizar o programa. Volte Sempre!");
			l.close();
			System.exit(0);
		}
		
		switch(op) {
		case 1:
			
				System.out.println("\nDigite seu nome: ");
				nome = l.next();
				fila.add(nome);
				
				System.out.println("\nNome adicionado");
			break;
			
		case 2:
				System.out.println(fila);
			break;
			
		case 3:
			fila.remove();			
		break;
		
		default:
			System.out.println("\nOpção invalida!");
			break;
		}
		
		}
		
	
		
		

	}

}
