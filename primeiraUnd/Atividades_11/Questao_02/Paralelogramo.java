package primeiraUnd.Atividades_11.Questao_02;

public class Paralelogramo implements Figura{
	private double base, altura, lado;

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public double perimetro() {
		return 2 * (base + lado);
	}

	public Paralelogramo(double base, double altura, double lado) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
}
