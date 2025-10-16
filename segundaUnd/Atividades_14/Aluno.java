package segundaUnd.Atividades_14;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String matricula;
	private String nome;
	
	public Aluno(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
    public int compareTo(Aluno outroAluno) {
        return this.nome.compareTo(outroAluno.getNome());
    }

	@Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        return Objects.equals(matricula, other.matricula);
    }
	
	@Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome;
    }
	
}
