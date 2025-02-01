import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine().trim(); // Usa nextLine para permitir espaços no nome

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine().trim(); // Usa nextLine para permitir espaços no sobrenome

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt(); // Lê um inteiro para a idade

        scanner.nextLine(); // Limpa o buffer do scanner para a próxima leitura de String
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble(); // Lê um double para a altura

        System.out.println("Seu nome é " + nome + " " + sobrenome + ". Sua idade é: " + idade + " anos e sua altura é: " + altura + " metros.");

        scanner.close(); // Fecha o scanner
    }
}
