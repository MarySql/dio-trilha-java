import java.util.Random;

public class MesadaDoWhileAleatorio {
    public static void main(String[] args) {
        double mesada = 50.0; // Começa com R$50,00
        Random random = new Random();
        int compras = 0; // Contador de compras

        System.out.println("Começando o mês com R$" + mesada);

        do {
            // Gera um gasto aleatório entre R$5,00 e R$15,00
            double gasto = 5 + (random.nextDouble() * 10); // (random.nextDouble() * 10) gera entre 0 e 10

            if (mesada < gasto) { // Se não tiver dinheiro suficiente, sai do loop
                System.out.println("🚨 Dinheiro insuficiente para a próxima compra!");
                break;
            }

            compras++;
            mesada -= gasto; // Subtrai o valor gasto
            System.out.printf("💸 Compra %d: Gastou R$%.2f | Saldo: R$%.2f%n", compras, gasto, mesada);

        } while (mesada > 0); // Continua enquanto houver dinheiro

        System.out.println("💰 Fim do mês! Total de compras feitas: " + compras);
    }
}
