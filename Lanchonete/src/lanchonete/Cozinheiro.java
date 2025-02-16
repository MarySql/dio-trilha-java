package lanchonete;

public class Cozinheiro {

    // Métodos privados - apenas a classe Cozinheiro pode chamar
    private void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }

    private void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    private void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    // Métodos públicos - podem ser chamados por outras classes
    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
        adicionarLancheNoBalcao(); // O lanche é preparado e colocado no balcão
    }

    public void prepararCombo() {
        System.out.println("PREPARANDO COMBO (LANCHE + SUCO)");
        adicionarComboNoBalcao();
    }

    public void lancheServido() {
        System.out.println("LANCHE SERVIDO À MESA!");
    }
}
