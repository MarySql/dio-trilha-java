import java.util.Scanner;

public class contaTerminal{
    public static void main(String[] args) {
        // Criando o Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis
        int numeroConta = 1021;
        String agencia = "067-8";
        String nomeCliente = "Kuchiki Rukia"; 
        double saldo = 237.48;

        // Solicita a entrada da conta
        System.out.print("Por favor, digite o número da Conta: ");
        String conta = scanner.nextLine();

        // Exibe os dados concatenados
        System.out.println("\nOlá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.");

        scanner.close();
    }
}
