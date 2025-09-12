package primeiraUnd.Atividades_08;

public class Livro extends Material{

	public Livro(String titulo) {
		super(titulo);
	}

	@Override
	public int prazoDevolucaoDias() {
		return 14;
	}

}