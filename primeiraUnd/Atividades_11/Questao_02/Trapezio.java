package primeiraUnd.Atividades_11.Questao_02;

public class Trapezio implements Figura{
	private double baseMaior, baseMenor, altura, l1, l2;

	@Override
	public double area() {
		return ((baseMaior + baseMenor) * altura)/2;
	}

	@Override
	public double perimetro() {
		return baseMaior + baseMenor + l1 + l2;
	}

	public Trapezio(double baseMaior, double baseMenor, double altura, double l1, double l2) {
		super();
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.l1 = l1;
		this.l2 = l2;
	}
	
}
