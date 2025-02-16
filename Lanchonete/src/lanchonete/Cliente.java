package lanchonete;

// Classe Cliente - Representa um cliente que faz um pedido
public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void fazerPedido() {
        System.out.println(nome + ": Quero um hambúrguer com suco, por favor!");
    }
}
