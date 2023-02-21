package arrays;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in); 
		int mat[][] = new int[3][3];
		int dPSoma =0, dSecSoma =0;
		
		for(int x = 0; x< mat.length; x++) {
			for(int y =0; y<mat.length; y++) {
				System.out.println("\nDigite os valores: ");
				mat[x][y] = l.nextInt();
			}
		}	
		
		for(int x = 0; x< mat.length; x++) {
			for(int y =0; y<mat.length; y++) {
				System.out.println("\nPosição "+x+" e "+y+" tem o número: "+mat[x][y]);
			}
		}	
		dPSoma = mat[0][0] + mat[1][1] + mat[2][2];
		dSecSoma = mat[0][2] + mat[1][1] + mat[2][0];
		System.out.println("\nA soma das diagonais principais é: "+dPSoma);
		System.out.println("\nA soma das diagonais secundáias é: "+dSecSoma);
	}
}