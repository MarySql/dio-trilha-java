package exemploAbstracao;

abstract class VeiculoMotorizado implements Veiculo {
    protected boolean ligado;
    protected int velocidadeAtual;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Veículo motorizado ligado.");
        } else {
            System.out.println("Veículo motorizado já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidadeAtual = 0;
            System.out.println("Veículo motorizado desligado.");
        } else {
            System.out.println("Veículo motorizado já está desligado.");
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}