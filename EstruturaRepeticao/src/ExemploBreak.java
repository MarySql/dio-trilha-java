public class ExemploBreak {
  public static void main(String[] args) {
      System.out.println("Contagem iniciada:");

      for (int i = 1; i <= 10; i++) {
          if (i == 5) {
              System.out.println("Alerta! Parando a contagem no número " + i);
              break; // Sai do loop imediatamente
          }
          System.out.println("Número: " + i);
      }

      System.out.println("Contagem encerrada!");
  }
}
