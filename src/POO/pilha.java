package POO;

import java.util.Scanner;
import java.util.Stack;

public class pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner l = new Scanner (System.in);
		
		//VARIAVEl
		String nome;
		int op;
		
		while(true) {
		System.out.println("               Bem vindo!               ");
		System.out.println("----------------------------------------");
		System.out.println("      1.Adicionar livros na pilha       ");
		System.out.println("      2.Listar livros na pilha          ");
		System.out.println("      3.Retirar livros na pilha         ");
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
			
				System.out.println("\nDigite o nome do livro: ");
				nome = l.next();
				pilha.push(nome);
				
				System.out.println("\nNome adicionado");
			break;
			
		case 2:
				System.out.println(pilha);
			break;
			
		case 3:
			pilha.pop();			
		break;
		
		default:
			System.out.println("\nOpção invalida!");
			break;
		}
		
		}

	}

}
