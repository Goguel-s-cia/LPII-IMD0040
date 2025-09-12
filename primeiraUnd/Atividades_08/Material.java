package primeiraUnd.Atividades_08;

public abstract class Material {
	private String titulo;
	
	public Material(String titulo) {
		this.titulo = titulo;
	}
	
	public abstract int prazoDevolucaoDias();
	
	public String getTitulo() {
		return titulo;
	}
	
}