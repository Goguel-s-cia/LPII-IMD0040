package primeiraUnd.Atividades_06;

public class Quarto {
	int numero;
	final int capacidade;
	Double precoBase;
	private boolean ocupado;
	
	public Quarto(int numero, int capacidade) {
		this.numero = numero;
		this.capacidade = capacidade;
		precoBase = 50.0;
	}
	
	public void checkIn() {
		if(ocupado) {
			System.err.println("O quarto Nº " + numero + " já está ocupado!");
			return;
		}
		System.err.println("Check-in feito com sucesso no quarto Nº " + numero);
		ocupado = true;
	}
	
	public void checkOut() {
		if(!ocupado) {
			System.err.println("Não é possível fazer check-out, pois o quarto Nº " + numero + " não está ocupado!");
			return;
		}
		System.err.println("Check-out feito com sucesso no quarto Nº " + numero);
		ocupado = false;
	}
	
	public boolean getOcupado() {
		return ocupado;
	}
	
	public Double calcularDiaria() {
		return null;
	}

	@Override
	public String toString() {
		return ("\nQuarto Nº " + numero +
				"\nCapacidade: " + capacidade + 
				"\nEstá ocupado?: " + (ocupado ? "Sim" : "Não")
				);
	}
}
