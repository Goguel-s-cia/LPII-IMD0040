package primeiraUnd.Atividades_09;

public class Aviao extends Aeronave{

	public Aviao(String modelo, int capacidadePassageiros, int anoFabricacao) {
		super(modelo, capacidadePassageiros, anoFabricacao);
	}

	@Override
	public void decolar() {
		System.out.println("O avião está decolando");
	}
	
}
