package primeiraUnd.Atividades_11.Questao_02;

public class Losango implements Figura{
	private double D, d, lado;

	@Override
	public double area() {
		return (D * d)/2;
	}

	@Override
	public double perimetro() {
		return 4 * lado;
	}

	public Losango(double d, double d2, double lado) {
		super();
		D = d;
		this.d = d2;
		this.lado = lado;
	}
	
}
