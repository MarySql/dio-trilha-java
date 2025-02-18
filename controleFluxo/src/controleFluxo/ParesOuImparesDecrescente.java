package controleFluxo;

import java.util.Scanner;

public class ParesOuImparesDecrescente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = scanner.nextInt();

		System.out.print("Digite o segundo número (maior que o primeiro): ");
		int num2 = scanner.nextInt();

		if (num2 <= num1) {
			System.out.println("O segundo número deve ser maior que o primeiro.");
			scanner.close();
			return;
		}

		System.out.print("Digite 'par' para números pares ou 'impar' para números ímpares: ");
		String escolha = scanner.next();

		if (!escolha.equals("par") && !escolha.equals("impar")) {
			System.out.println("Escolha inválida. Use 'par' ou 'impar'.");
			scanner.close();
			return;
		}

		for (int numero = num2; numero >= num1; numero--) {
			if (escolha.equals("par") && numero % 2 == 0) {
				System.out.println(numero);
			} else if (escolha.equals("impar") && numero % 2 != 0) {
				System.out.println(numero);
			}
		}

		scanner.close();
	}
}