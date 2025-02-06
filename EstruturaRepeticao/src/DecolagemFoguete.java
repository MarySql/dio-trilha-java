public class DecolagemFoguete {
  public static void main(String[] args) {
      System.out.println("Preparando para a decolagem...");

      // Contagem regressiva de 10 até 0
      for (int i = 10; i >= 0; i--) {
          System.out.println("T-" + i + " segundos");

          // Simula uma pequena pausa (apenas para efeito visual)
          try {
              Thread.sleep(1000); // Espera 1 segundo (1000ms)
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }

      System.out.println("🔥 Foguete lançado! Rumo ao espaço! 🚀");
  }
}
