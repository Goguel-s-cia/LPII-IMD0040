package primeiraUnd.Atividades_09;

public class Piloto {
	private String nome;
	private String cargo;
	private int experienciaAnos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getExperienciaAnos() {
		return experienciaAnos;
	}

	public void setExperienciaAnos(int experienciaAnos) {
		this.experienciaAnos = experienciaAnos;
	}

	public Piloto(String nome, String cargo, int experienciaAnos) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.experienciaAnos = experienciaAnos;
	}

	public void comandarVoo() {
		System.out.println("Comandando voo");
	}

	public void exibirInfo() {
		System.out.println("O nome do piloto é: " + nome);
		System.out.println("O cargo do piloto é: " + cargo);
		System.out.println("A quantidade de anos de experiência do piloto é: " + experienciaAnos);
	}
}
