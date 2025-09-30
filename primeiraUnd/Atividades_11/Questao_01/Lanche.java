package primeiraUnd.Atividades_11.Questao_01;

public class Lanche implements Produto{
	private String nome;
	private double preco;
	private boolean isSalgado;
	
	public Lanche(String nome, double preco, boolean isSalgado) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.isSalgado = isSalgado;
	}

	@Override
	public String getState() {
		return isSalgado ? "é salgado" : "não é salgado";
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
