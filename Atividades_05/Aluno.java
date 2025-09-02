package primeiraUnd.Atividades_05;

public class Aluno extends Pessoa {
	private String matricula;
	
	public Aluno(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}
	
	@Override
	public String apresentar() {
		return(super.apresentar() + ". E minha matrícula é " + this.matricula + "\n");
	}
}
