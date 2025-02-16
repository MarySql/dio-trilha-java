package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe Junior");
		felipe.setIdade(14);
		
		System.out.println("O aluno " + felipe.getNome() + " Tem " + felipe.getIdade() + " anos.");

	}

}
