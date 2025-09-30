package primeiraUnd.Atividades_11.Questao_02;

public class Triangulo implements Figura{
	private double base, altura, ladoA, ladoB, ladoC;

	@Override
	public double area() {
		return (base * altura)/2;
	}

	@Override
	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}

	public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super();
		this.base = base;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
}