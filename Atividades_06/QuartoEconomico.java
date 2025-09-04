package primeiraUnd.Atividades_06;

public class QuartoEconomico extends Quarto{
	
	public QuartoEconomico(int numero, int capacidade) {
		super(numero, capacidade);
	}
	
	@Override
	public Double calcularDiaria() {
		return (precoBase - 30.0) >= 0 ? (precoBase - 30.0) : 0.0 ;
	}
	


}
