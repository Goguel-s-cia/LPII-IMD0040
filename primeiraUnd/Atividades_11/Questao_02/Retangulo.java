package primeiraUnd.Atividades_11.Questao_02;

public class Retangulo implements Figura{
	private double base, altura;

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public double perimetro() {
		return 2 * (base + altura);
	}

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
}
