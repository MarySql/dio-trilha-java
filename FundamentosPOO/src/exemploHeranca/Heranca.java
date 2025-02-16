package exemploHeranca;

public class Heranca {
	  public static void main(String[] args) {
	        Cachorro cachorro = new Cachorro("Rex", 3, "Pastor Alemão");
	        Gato gato = new Gato("Mingau", 2, "Branco");

	        cachorro.exibirInformacoes();
	        cachorro.emitirSom();
	        cachorro.latir();

	        System.out.println(); // Linha em branco para separar a saída

	        gato.exibirInformacoes();
	        gato.emitirSom();
	        gato.miar();
	    }
}
