package lanchonete;

// Classe Estabelecimento - Gerencia todas as operações
public class Estabelecimento {
	private Almoxarife almoxarife;
	private Atendente atendente;
	private Cliente cliente;

	public Estabelecimento() {
		this.almoxarife = new Almoxarife();
		this.atendente = new Atendente();
	}

	public void receberCliente(Cliente cliente) {
		this.cliente = cliente;
		System.out.println("\n🔹 Novo cliente chegou: " + cliente);
		cliente.fazerPedido();

		atendente.anotarPedido();
		almoxarife.verificarEstoque();
		almoxarife.reporEstoque();
		atendente.entregarPedido();

		System.out.println("🍔 Pedido finalizado para o cliente!\n");
	}

	public static void main(String[] args) {
		Estabelecimento lanchonete = new Estabelecimento();

		Cliente cliente1 = new Cliente("João");
		Cliente cliente2 = new Cliente("Maria");

		lanchonete.receberCliente(cliente1);
		lanchonete.receberCliente(cliente2);
	}
}
