package primeiraUnd.Atividades_11.Questao_02;

public class Circulo implements Figura{
	private double raio;

	@Override
	public double area() {
		return PI * (raio*raio);
	}

	@Override
	public double perimetro() {
		return 2 * PI * raio;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
}
