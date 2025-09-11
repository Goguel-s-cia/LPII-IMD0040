package primeiraUnd.Atividades_05;

public class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String apresentar() {
		return("Meu nome é " + this.nome);
	}
}
