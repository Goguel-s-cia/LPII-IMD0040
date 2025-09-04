package primeiraUnd.Atividades_06;

public final class SuitePresidencial extends Quarto{
	
	public SuitePresidencial(int numero, int capacidade) {
		super(numero, capacidade);
	}
	
	@Override
	public Double calcularDiaria() {
		return precoBase + 200.0;
	}


}
