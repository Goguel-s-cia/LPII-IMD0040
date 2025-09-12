package primeiraUnd.Atividades_08;

public class Revista extends Material{

	public Revista(String titulo) {
		super(titulo);
	}

	@Override
	public int prazoDevolucaoDias() {
		return 7;
	}

}