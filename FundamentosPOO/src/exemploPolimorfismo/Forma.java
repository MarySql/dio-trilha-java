package exemploPolimorfismo;

//Abstração: Definindo uma interface comum para formas geométricas
abstract class Forma {
	
	// Método abstrato: Implementação específica em subclasses
	abstract double calcularArea();

	// Método concreto: Comportamento comum a todas as formas
	void exibirInformacoes() {
		System.out.println("Esta é uma forma geométrica.");
	}
}