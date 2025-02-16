package exemploPolimorfismo;

public class ExemploPOO {
	public static void main(String[] args) {
		// Polimorfismo: Tratando objetos de diferentes classes de forma uniforme
		Forma forma1 = new Circulo(5);
		Forma forma2 = new Retangulo(4, 6);

		forma1.exibirInformacoes();
		System.out.println("Área do círculo: " + forma1.calcularArea());

		forma2.exibirInformacoes();
		System.out.println("Área do retângulo: " + forma2.calcularArea());
	}
}