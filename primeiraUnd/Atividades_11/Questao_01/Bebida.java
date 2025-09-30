package primeiraUnd.Atividades_11.Questao_01;

public class Bebida implements Produto{
	private String nome;
	private double preco;
	private boolean isAlcoolica;
	
	public Bebida(String nome, double preco, boolean isAlcoolica) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.isAlcoolica = isAlcoolica;
	}
	
	@Override
	public String getState() {
		return isAlcoolica ? "é alcoólica" : "não é alcoólica";
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}
}
