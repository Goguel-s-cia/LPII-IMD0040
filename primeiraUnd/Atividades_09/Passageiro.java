package primeiraUnd.Atividades_09;

public class Passageiro {
	private String nome;
	private int idade;
	private String destino;
	
	public void embarcar() {
		System.out.println("O passageiro embarcou");
	}

	public Passageiro(String nome, int idade, String destino) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.destino = destino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
}
