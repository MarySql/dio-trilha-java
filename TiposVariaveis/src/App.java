public class App {
    public static void main(String[] args) {

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numeroNormal);

        final double VALOR_PI = 3.14;
        System.out.println(VALOR_PI);
    }
}
