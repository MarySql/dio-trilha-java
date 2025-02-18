package controleFluxo;

import java.util.Scanner;

public class DivisaoResto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número inicial: ");
		int numeroInicial = scanner.nextInt();

		while (true) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();

			if (numero < numeroInicial) {
				System.out.println("Número ignorado (menor que o número inicial).");
				continue;
			}

			int resto = numero % numeroInicial;

			if (resto != 0) {
				System.out
						.println("O número " + numero + " dividido por " + numeroInicial + " tem resto " + resto + ".");
				break;
			}
		}

		scanner.close();
	}
}