class JogoSudoku {
    private final int[][] tabuleiro = new int[9][9];
    private final boolean[][] fixos = new boolean[9][9];
    private final boolean[][] adicionados = new boolean[9][9];

    public void setNumeroFixo(int linha, int coluna, int valor) {
        if (valor >= 1 && valor <= 9) {
            tabuleiro[linha][coluna] = valor;
            fixos[linha][coluna] = true;
        }
    }

    public boolean inserirNumero(int linha, int coluna, int valor) {
        if (fixos[linha][coluna] || tabuleiro[linha][coluna] != 0) {
            return false;
        }
        tabuleiro[linha][coluna] = valor;
        adicionados[linha][coluna] = true;
        return true;
    }

    public boolean removerNumero(int linha, int coluna) {
        if (fixos[linha][coluna]) {
            return false;
        }
        tabuleiro[linha][coluna] = 0;
        adicionados[linha][coluna] = false;
        return true;
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (fixos[i][j]) {
                    System.out.print(tabuleiro[i][j] + " ");
                } else if (adicionados[i][j]) {
                    System.out.print(tabuleiro[i][j] + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}