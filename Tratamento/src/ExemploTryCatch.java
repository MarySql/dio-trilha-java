import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = Integer.parseInt(scanner.nextLine()); // Pode gerar exceção se entrada for inválida
            System.out.println("Você digitou: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida! Digite apenas números inteiros.");
        } finally {
            scanner.close(); // Fecha o scanner para evitar vazamento de recurso
            System.out.println(" Programa finalizado.");
        }
    }
}
