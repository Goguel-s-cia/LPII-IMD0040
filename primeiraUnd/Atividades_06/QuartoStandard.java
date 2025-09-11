package primeiraUnd.Atividades_06;

public class QuartoStandard extends Quarto{
	
	public QuartoStandard(int numero, int capacidade) {
		super(numero, capacidade);
	}
	
	@Override
	public Double calcularDiaria() {
		return precoBase;
	}

}
