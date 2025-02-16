package exemploPolimorfismo;

//Herança: Retângulo é uma subclasse de Forma
class Retangulo extends Forma {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	// Polimorfismo: Sobrescrita do método calcularArea()
	@Override
	double calcularArea() {
		return largura * altura;
	}
}
