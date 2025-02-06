public class ResultadoEscolar { // 'class' deve estar em minúsculas

    public static void main(String[] args) {
        int nota = 6;
        if (nota >= 7)
            System.out.println("Aprovado!"); // Alterei para System.out.println para manter padrão

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovadinho");
    }
}
