package primeiraUnd.Atividades_06;

public class Suite extends Quarto{
	
	public Suite(int numero, int capacidade) {
		super(numero, capacidade);
	}
	
	@Override
	public Double calcularDiaria() {
		boolean hasHidromassagem = false;
		return hasHidromassagem ? (precoBase + 120.0) : (precoBase + 80.0);
	}


}
