package primeiraUnd.Atividades_10;

public class Smartphone implements DispositivoEletronico {

	private String marca;
	private String modelo;
	private boolean isLigado;
	
	public Smartphone(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.isLigado = false;
	}
	
	@Override
	public void ligar() {
		System.out.println("Ligando o Smartphone " + marca + " " + modelo + "...");
		isLigado = true;
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o Smartphone " + marca + " " + modelo + "...");
		isLigado = false;
	}

	@Override
	public void status() {
		System.out.println("Status do Smartphone: " + (isLigado ? "Ligado." : "Desligado."));
	}

}	
