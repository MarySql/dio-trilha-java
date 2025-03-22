import java.util.Scanner;

class MenuInterativo {
    private final JogoSudoku jogo;
    private final Scanner scanner = new Scanner(System.in);

    public MenuInterativo(JogoSudoku jogo) {
        this.jogo = jogo;
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("\nMenu Sudoku:");
            System.out.println("1. Inserir número");
            System.out.println("2. Remover número");
            System.out.println("3. Ver tabuleiro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Linha: ");
                    int linha = scanner.nextInt();
                    System.out.print("Coluna: ");
                    int coluna = scanner.nextInt();
                    System.out.print("Número: ");
                    int numero = scanner.nextInt();
                    if (!jogo.inserirNumero(linha, coluna, numero)) {
                        System.out.println("Não é possível inserir nesse local.");
                    }
                    break;
                case 2:
                    System.out.print("Linha: ");
                    linha = scanner.nextInt();
                    System.out.print("Coluna: ");
                    coluna = scanner.nextInt();
                    if (!jogo.removerNumero(linha, coluna)) {
                        System.out.println("Não é possível remover esse número.");
                    }
                    break;
                case 3:
                    jogo.exibirTabuleiro();
                    break;
                case 4:
                    System.out.println("Jogo encerrado!");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
