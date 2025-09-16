package primeiraUnd.Atividades_09;

public class Helicoptero extends Aeronave {
	
	private String tipoRotor;

	public Helicoptero(String modelo, int capacidadePassageiros, int anoFabricacao, String tipoRotor) {
		super(modelo, capacidadePassageiros, anoFabricacao);
		this.tipoRotor = tipoRotor;
	}

	public String getTipoRotor() {
		return tipoRotor;
	}

	public void setTipoRotor(String tipoRotor) {
		this.tipoRotor = tipoRotor;
	}

	@Override
	public void decolar() {
		System.out.println("O helicóptero está decolando");
	}

}
