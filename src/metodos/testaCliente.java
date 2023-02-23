package metodos;

import java.util.Scanner;

public class testaCliente {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		String novoEnd;
		int numRua;

		cliente cli = new cliente("Samuel", "Rua firifó", 2561, 21, 145);

		cli.visualizar();
		System.out.println("\nDigite o novo endereço: ");
		novoEnd = l.nextLine();
		System.out.println("\nDigite o novo número da casa: ");
		numRua = l.nextInt();
		cli.alteraRua(novoEnd);
		cli.alteraNcasa(numRua);
		cli.visualizar();

	}

}
