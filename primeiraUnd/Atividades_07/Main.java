package primeiraUnd.Atividades_07;

public class Main {

	public static void main(String[] args) {
		
		Motor m1 = new Motor("V8", 150);
		Rodas r1 = new Rodas(18, "borracha comum");
		Direcao d1 = new Direcao("Hidráucila");
		Carro c1 = new Carro(m1, r1, d1);
		
		Motor m2 = new Motor("Turbo", 200);
		Rodas r2 = new Rodas(17, "borracha eletrostática");
		Direcao d2 = new Direcao("Manual");
		Carro c2 = new Carro(m2, r2, d2);
		
		Motor m3 = new Motor("Elétrico", 300);
		Rodas r3 = new Rodas(20, "borracha vulcanizada");
		Direcao d3 = new Direcao("Hidráulica");
		Carro c3 = new Carro(m3, r3, d3);
		
		c1.mostrarConfiguracao();
		System.out.println("-------------------------");
		c2.mostrarConfiguracao();
		System.out.println("-------------------------");
		c3.mostrarConfiguracao();

	}

}
