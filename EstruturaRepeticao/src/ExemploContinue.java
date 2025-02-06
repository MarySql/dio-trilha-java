public class ExemploContinue {
  public static void main(String[] args) {
      System.out.println("Contagem iniciada:");

      for (int i = 1; i <= 10; i++) {
          if (i == 5) {
              System.out.println("Pulando o número " + i);
              continue; // Pula a iteração e vai para o próximo número
          }
          System.out.println("Número: " + i);
      }

      System.out.println("Contagem encerrada!");
  }
}
