import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Loja {
	public static void main(String[] args) {
		List<Produto> produtos = Arrays.asList(new Produto("Notebook", 3500.00, "Eletrônicos"),
				new Produto("Smartphone", 2000.00, "Eletrônicos"), new Produto("Camiseta", 50.00, "Vestuário"),
				new Produto("Tênis", 300.00, "Calçados"), new Produto("Mouse", 150.00, "Eletrônicos"));

		// Filtrar produtos com preço acima de R$1000
		List<Produto> caros = produtos.stream().filter(p -> p.getPreco() > 1000).collect(Collectors.toList());

		System.out.println("Produtos caros:");
		caros.forEach(System.out::println);

		// Ordenar produtos por preço
		List<Produto> ordenadosPorPreco = produtos.stream().sorted(Comparator.comparingDouble(Produto::getPreco))
				.collect(Collectors.toList());

		System.out.println("\nProdutos ordenados por preço:");
		ordenadosPorPreco.forEach(System.out::println);

		// Mapear produtos para descrições
		List<String> descricoes = produtos.stream().map(p -> "Produto: " + p.getNome() + " custa R$" + p.getPreco())
				.collect(Collectors.toList());

		System.out.println("\nDescrições dos produtos:");
		descricoes.forEach(System.out::println);
	}
}
