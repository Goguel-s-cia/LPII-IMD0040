package primeiraUnd.Atividades_05;

public class Funcionario extends Pessoa{
	public String cargo;
	
	public Funcionario(String nome, String cargo) {
		super(nome);
		this.cargo = cargo;
	}
	
	@Override
	public String apresentar() {
		return(super.apresentar() + ". E meu cargo é " + this.cargo + "\n");
	}
	

}
