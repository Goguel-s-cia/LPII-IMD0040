package segundaUnd.Atividades_15;

public class Produto {
	private String nome;
	private int codigo;
	
	public Produto(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Produto{nome=" + nome + ", codigo=" + codigo + "}";
	}
}
