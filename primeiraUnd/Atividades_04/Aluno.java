package primeiraUnd.Atividades_04;

public class Aluno {
	
	private String nome;
	private String matricula;
	private Double media, nota1, nota2;
	public static int totalAlunos = 0;
	
	/*
	 * Construtor vazio
	 */
	public Aluno() {
		this.totalAlunos++;
	}
	
	/*
	 * Construtor com argumentos
	 */
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = 0.0;
		this.nota2 = 0.0;
		this.totalAlunos++;
	}
	
	/*
	 * Define a primeira nota do aluno
	 */
	public void setNota1(Double nota) {
		if(nota >= 0.0 && nota <= 10.0) {
			this.nota1 = nota;
			return;
		} 
		this.nota1 = 0.0;
	}

	/*
	 * Define a segunda nota do aluno
	 */
	public void setNota2(Double nota) {
		if(nota >= 0.0 && nota <= 10.0) {
			this.nota2 = nota;
			return;
		} 
		this.nota2 = 0.0;
	}
	
	/*
	 * Calcula a média do aluno
	 */
	public void calcularMedia() {
		this.media = (this.nota1 + this.nota2)/2;
	}
	
	/*
	 * Exibe as informações do aluno
	 */
	public void exibirInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Nota 1: " + this.nota1);
		System.out.println("Nota 2: " + this.nota2);
		System.out.println("Média: " + this.media + "\n");
	}
	
	/*
	 * Verifica se o aluno está aprovado
	 */
	public void isAprovado() {
		boolean aprovado = this.media >= 6.0 ? true : false;
		
		if(aprovado) {
			System.out.println("O aluno " + this.nome + " está aprovado\n");
			return;
		}
		
		System.out.println("O aluno " + this.nome + " está reprovado\n");
	}
}
