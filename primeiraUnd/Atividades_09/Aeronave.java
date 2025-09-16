package primeiraUnd.Atividades_09;

public abstract  class Aeronave {
	private String modelo;
	private int capacidadePassageiros;
	private int anoFabricacao;

	public Aeronave(String modelo, int capacidadePassageiros, int anoFabricacao) {
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
		this.anoFabricacao = anoFabricacao;
	}

	public abstract void decolar();

	public void exibirInfo() {
		System.out.println("O modelo da aeronave é: " + modelo);
		System.out.println("A capacidade de passageiros da aeronave é: " + capacidadePassageiros);
		System.out.println("O ano de fabricação da aeronave é: " + anoFabricacao);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

}
