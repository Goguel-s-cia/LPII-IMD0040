package primeiraUnd.Atividades_06;

public class Main {

	public static void main(String[] args) {
		
		Quarto[] quartos = new Quarto[7];
		
		quartos[0] = new QuartoStandard(200, 3);
		quartos[1] = new QuartoStandard(201, 3);
		quartos[2] = new QuartoEconomico(100, 1);
		quartos[3] = new QuartoEconomico(101, 2);
		quartos[4] = new Suite(300, 4);
		quartos[5] = new Suite(301, 4);
		quartos[6] = new SuitePresidencial(400, 7);
		
		// Simulação de entradas e saídas dos quartos(Check-in e check-out)
		quartos[0].checkIn();
		quartos[1].checkOut();
		quartos[3].checkIn();
		quartos[5].checkIn();
		quartos[0].checkOut();
		quartos[6].checkIn();
		quartos[3].checkOut();
		quartos[5].checkIn();
		quartos[6].checkOut();
		
		System.out.println("\n----------------");
		
		// Exibição das informações e diária de cada quarto
		for(Quarto q : quartos) {
			System.err.println(q.toString());
			System.err.println("Preço da diária: " + q.calcularDiaria());
		}
		
		System.out.println("\n----------------");
		
		int qtdEco = 0, qtdSta = 0, qtdSui = 0, qtdSpr = 0;
		
		// Contagem de quantos quartos de cada tipo existem
		for(Quarto q : quartos) {
			if(q instanceof QuartoEconomico) {
				qtdEco++;
			}
			if(q instanceof QuartoStandard) {
				qtdSta++;			
			}
			if(q instanceof Suite) {
				qtdSui++;
			}
			if(q instanceof SuitePresidencial) {
				qtdSpr++;
			}
		}
		
		// Exibição da quantidade de quartos de cada tipo
		System.err.println("\nQuantidade de quartos do tipo: " +
						   "\nEconomico: " + (qtdEco == 1 ? "1 quarto" : qtdEco + " quartos") + 
						   "\nStandart: " + (qtdSta == 1 ? "1 quarto" : qtdSta + " quartos") +
						   "\nSuíte: " + (qtdSui == 1 ? "1 quarto" : qtdSui + " quartos") + 
						   "\nSuíte presidencial: " + (qtdSpr == 1 ? "1 quarto" : qtdSpr + " quartos")
						   );
		
		System.out.println("\n----------------");
		
		Double fatEstimado = 0.0;
		
		for(Quarto q : quartos) {
			if(q.getOcupado()) {
				fatEstimado += q.calcularDiaria();
			}
		}
		
		System.err.println("\nO faturamento estimado é de: R$ " + fatEstimado);
	}
}
