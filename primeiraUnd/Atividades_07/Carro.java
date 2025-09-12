package primeiraUnd.Atividades_07;

public class Carro {
	
	private Motor motor;
	private Rodas rodas;
	private Direcao direcao;
	
	public Carro(Motor motor, Rodas rodas, Direcao direcao) {
		this.motor = motor;
		this.rodas = rodas;
		this.direcao = direcao;
	}
	
	public void mostrarConfiguracao() {
		System.out.println("Configuração do Carro:");
		System.out.println("Modelo do Motor: " + motor.getModelo());
		System.out.println("Tamanho das Rodas: " + rodas.getTamanho() + " polegadas");
		System.out.println("Tipo de Direção: " + direcao.getTipo());
	}

}
