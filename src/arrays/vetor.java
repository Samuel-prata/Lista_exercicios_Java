package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		
		int vet[] = {7, 4, 9, 2, 10, 6, 3, 1, 5, 8};
		int i, esc, posicao;
		//INICIO
		
		Arrays.sort(vet);//ordenar vetor
		
		System.out.println("\nDigite um valor: ");
		esc = l.nextInt();
		
		posicao = Arrays.binarySearch(vet, esc);
		
		if(posicao >= 0) {
			System.out.println("\nNumero "+esc+ " esta localizado na posição: "+posicao);
		}else {
			System.out.println("\nNumero "+esc+ " não encontrado");
		}
		
		
		
		
	}

	}


