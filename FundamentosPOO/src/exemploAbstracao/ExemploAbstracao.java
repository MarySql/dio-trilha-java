package exemploAbstracao;

public class ExemploAbstracao {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.ligar();
        carro.acelerar(30);
        carro.acelerar(20);
        carro.desligar();

        System.out.println(); // Linha em branco para separar a saída

        moto.ligar();
        moto.acelerar(50);
        moto.acelerar(120);
        moto.desligar();
    }
}