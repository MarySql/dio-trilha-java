package exemploAbstracao;

class Moto extends VeiculoMotorizado {
    public void acelerar(int velocidade) {
        if (ligado) {
            velocidadeAtual += velocidade;
            System.out.println("Moto acelerando para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Ligue a moto antes de acelerar.");
        }
    }
}

