package primeiraUnd.Atividades_11.Questao_01;

public class Higiene implements Produto{
	private String nome;
	private double preco;
	private boolean isLiquido;
	
	public Higiene(String nome, double preco, boolean isLiquido) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.isLiquido = isLiquido;
	}
	
	@Override
	public String getState() {
		return isLiquido ? "é líquido" : "não é líquido";
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
