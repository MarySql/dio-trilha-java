package exemploHeranca;

class Animal {
	String nome;
	int idade;

	// Construtor
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Método comum a todos os animais
	public void emitirSom() {
		System.out.println("Animal emitindo som...");
	}

	// Método para exibir informações do animal
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
