import java.text.NumberFormat;
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
        }

        // Criando um formatador para moeda brasileira (BRL)
        NumberFormat formatoBRL = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        // Exibindo o saldo formatado
        System.out.println("Saldo atual: " + formatoBRL.format(saldo));
    }
}
