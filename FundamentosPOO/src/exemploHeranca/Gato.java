package exemploHeranca;

class Gato extends Animal {
    String cor;

    // Construtor da subclasse
    public Gato(String nome, int idade, String cor) {
        // Chama o construtor da superclasse
        super(nome, idade);
        this.cor = cor;
    }

    // Sobrescrita do método emitirSom()
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    // Método específico do gato
    public void miar() {
        System.out.println("O gato está miando!");
    }

        // Sobrescrita do método exibirInformacoes()
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cor: " + cor);
    }
}

