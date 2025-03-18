
public class Main {

	public static void main(String[] args) {
		Cliente Maryane = new Cliente();
		Maryane.setNome("Maryane");
		
		Conta cc = new ContaCorrente(Maryane);
		Conta poupanca = new ContaPoupanca(Maryane);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
