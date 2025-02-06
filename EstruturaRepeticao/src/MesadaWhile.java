public class MesadaWhile {
  public static void main(String[] args) {
      double mesada = 50.0; // Começa com R$50,00
      double gasto = 8.0; // Cada compra custa R$8,00
      int compras = 0; // Contador de compras

      System.out.println("Começando o mês com R$" + mesada);

      while (mesada >= gasto) { // Enquanto tiver dinheiro suficiente
          compras++;
          mesada -= gasto; // Subtrai o valor gasto
          System.out.println("💸 Compra " + compras + ": Gastou R$" + gasto + " | Saldo: R$" + mesada);
      }

      System.out.println("🚨 Acabou a mesada! Total de compras feitas: " + compras);
  }
}
