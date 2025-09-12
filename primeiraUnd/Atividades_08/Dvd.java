package primeiraUnd.Atividades_08;

public class Dvd extends Material{

	public Dvd(String titulo) {
		super(titulo);
	}

	@Override
	public int prazoDevolucaoDias() {
		return 3;
	}

}