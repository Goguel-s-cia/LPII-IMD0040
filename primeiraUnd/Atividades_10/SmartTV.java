package primeiraUnd.Atividades_10;

public class SmartTV implements DispositivoEletronico{

	private String marca;
	private int tamanho;
	private boolean isLigada;
	
	public SmartTV(String marca, int tamanho) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.isLigada = false;
	}
	
	@Override
	public void ligar() {
		System.out.println("Ligando a SmartTV " + marca + " " + tamanho + " polegadas...");
		isLigada = true;
	}

	@Override
	public void desligar() {
		System.out.println("Desligando a SmartTV " + marca + " " + tamanho + " polegadas...");
		isLigada = false;
	}

	@Override
	public void status() {
		System.out.println("Status da SmartTV: " + (isLigada ? "Ligada." : "Desligada."));
	}

}	
