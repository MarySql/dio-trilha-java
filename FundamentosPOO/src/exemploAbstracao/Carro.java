package exemploAbstracao;

class Carro extends VeiculoMotorizado {
    public void acelerar(int velocidade) {
        if (ligado) {
            velocidadeAtual += velocidade;
            System.out.println("Carro acelerando para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Ligue o carro antes de acelerar.");
        }
    }
}
