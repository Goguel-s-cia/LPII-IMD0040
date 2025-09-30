package primeiraUnd.Atividades_11.Questao_02;

public class Quadrado implements Figura{
	private double lado;

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimetro() {
		return 4 * lado;
	}

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
}
