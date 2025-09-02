package primeiraUnd.Atividades_05;

public class Professor extends Pessoa {
	private String disciplina;
	
	public Professor(String nome, String disciplina) {
		super(nome);
		this.disciplina = disciplina;
	}
	
	@Override
	public String apresentar() {
		return(super.apresentar() + ". E minha disciplina é " + this.disciplina + "\n");
	}
	
}
