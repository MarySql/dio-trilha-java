package controleFluxo;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua altura em metros: ");
		double altura = scanner.nextDouble();

		System.out.println("Digite seu peso em quilogramas: ");
		double peso = scanner.nextDouble();

		double imc = peso / (altura * altura);

		System.out.println("Seu IMC é: " + String.format("%.2f", imc));

		if (imc <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc <= 24.9) {
			System.out.println("Peso ideal");
		} else if (imc <= 29.9) {
			System.out.println("Levemente acima do peso");
		} else if (imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (imc <= 39.9) {
			System.out.println("Obesidade Grau II (Severa)");
		} else {
			System.out.println("Obesidade Grau III (Mórbida)");
		}

		scanner.close();
	}
}
