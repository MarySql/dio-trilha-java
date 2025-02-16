package exemploPolimorfismo;

//Herança: Círculo é uma subclasse de Forma
class Circulo extends Forma {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	// Polimorfismo: Sobrescrita do método calcularArea()
	@Override
	double calcularArea() {
		return Math.PI * raio * raio;
	}
}