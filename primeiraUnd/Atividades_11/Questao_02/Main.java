package primeiraUnd.Atividades_11.Questao_02;

public class Main {

	public static void main(String[] args) {
		Circulo cir = new Circulo(4);
		Retangulo ret = new Retangulo(3, 5);
		Quadrado qua = new Quadrado(4);
		Triangulo tri = new Triangulo(2, 4, 2, 3, 3);
		Trapezio tra = new Trapezio(3, 4, 2, 2, 3);
		Paralelogramo par = new Paralelogramo(3, 2, 2);
		Losango los = new Losango(3, 4, 3);
		
		Figura[] figuras = new Figura[7];
		
		figuras[0] = cir;
		figuras[1] = ret;
		figuras[2] = qua;
		figuras[3] = tri;
		figuras[4] = tra;
		figuras[5] = par;
		figuras[6] = los;
		
		for(Figura f : figuras) {
			System.out.println("A área da figura: " + f.area());
			System.out.println("O perímetro da fiura: " + f.perimetro() + "\n");
		}
		
		System.out.println("\nA maior área é " + maiorArea(figuras));
	}
	
	private static double maiorArea(Figura[] figuras) {
		double maior = 0.0;
		for(Figura f : figuras) {
			if(f.area() >= maior) {
				maior = f.area();
			}
		}
		return maior;
	}

}
