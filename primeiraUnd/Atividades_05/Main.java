package primeiraUnd.Atividades_05;

public class Main {

	public static void main(String[] args) {
		
		Aluno a = new Aluno("João", "1234");
		Professor p = new Professor("Carlos", "Matemática");
		Funcionario f = new Funcionario("José", "Diretor");
		
		System.out.println(a.apresentar());
		System.out.println(p.apresentar());
		System.out.println(f.apresentar());
		
	}
}
