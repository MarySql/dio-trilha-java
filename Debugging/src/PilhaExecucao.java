public class PilhaExecucao {
    public static void main(String[] args) {
        System.out.println("Início do main");
        metodoA();
        System.out.println("Fim do main");
    }

    public static void metodoA() {
        System.out.println("Entrou no método A");
        metodoB();
        System.out.println("Saindo do método A");
    }

    public static void metodoB() {
        System.out.println("Entrou no método B");
        metodoC();
        System.out.println("Saindo do método B");
    }

    public static void metodoC() {
        System.out.println("Entrou no método C");
        // Aqui não chamamos mais ninguém, então ele retorna
        System.out.println("Saindo do método C");
    }
}
