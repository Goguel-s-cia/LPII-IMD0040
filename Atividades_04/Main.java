package primeiraUnd.Atividades_04;

public class Main {

	public static void main(String[] args) {
		
		//Cria os alunos
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("Roberval", "1234");
		Aluno a3 = new Aluno("Marcos", "4321");
		
		//Define as notas
		a1.setNota1(8.5);
		a1.setNota2(3.0);
		a2.setNota1(4.0);
		a2.setNota2(6.0);
		a3.setNota1(9.0);
		a3.setNota2(10.0);
		
		// Calcula as médias
		a1.calcularMedia();
		a2.calcularMedia();
		a3.calcularMedia();
		
		// Exibe as informações
		a1.exibirInfo();
		a2.exibirInfo();
		a3.exibirInfo();
		
		// Exibe se o aluno está aprovado ou reprovado
		a1.isAprovado();
		a2.isAprovado();
		a3.isAprovado();
		
		// Exibe o total de alunos
		System.out.println("O total de alunos criados é de: " + Aluno.totalAlunos + " alunos");
	}
}
