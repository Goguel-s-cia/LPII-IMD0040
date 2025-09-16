package primeiraUnd.Atividades_09;

public class Aeroporto {
	private String nome, localizacao;
	
	public void receberAeronave() {
		System.out.println("Recebendo uma aeronova no aeroporto");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Aeroporto(String nome, String localizacao) {
		super();
		this.nome = nome;
		this.localizacao = localizacao;
	}

	public void liberarDecolagem() {
		System.out.println("Decolagem liberada");
	}
	
	public void abastecerAeronave() {
		System.out.println("Aeronave abastecida");
	}
}
