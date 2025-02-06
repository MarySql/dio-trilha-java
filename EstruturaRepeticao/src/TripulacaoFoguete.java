public class TripulacaoFoguete {

  public static void main(String[] args) {
      
      String[] astronautas = {"Alice", "Bob", "Carlos", "Diana"};

      System.out.println("Tripulação confirmada para a missão espacial:");

      // Usando um loop for para percorrer o array
      for (int i = 0; i < astronautas.length; i++) {
          System.out.println("Astronauta " + (i + 1) + ": " + astronautas[i]);
      }

      System.out.println("Todos a bordo! Preparar para a decolagem!");
  }
}
