package exemploHeranca;

class Cachorro extends Animal {
	String raca;

	// Construtor da subclasse
	public Cachorro(String nome, int idade, String raca) {
		// Chama o construtor da superclasse
		super(nome, idade);
		this.raca = raca;
	}

	// Sobrescrita do método emitirSom()
	@Override
	public void emitirSom() {
		System.out.println("Au au!");
	}

	// Método específico do cachorro
	public void latir() {
		System.out.println("O cachorro está latindo!");
	}

	// Sobrescrita do método exibirInformacoes()
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Raça: " + raca);
	}
}
