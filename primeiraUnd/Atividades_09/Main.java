package primeiraUnd.Atividades_09;

public class Main {

	public static void main(String[] args) {
		Aviao aviao = new Aviao("Boing 747", 350, 2018);
		Helicoptero helic = new Helicoptero("Airbus", 10, 2015, "Bidirecional");
		Passageiro passa = new Passageiro("Fernando", 30, "Flórida");
		Piloto pilot = new Piloto("Henrique", "Comandante", 13);
		Rota rota = new Rota("Campinas", "Nova York", 7680.0, 10.5);
		Aeroporto aerop = new Aeroporto("Viracopos", "Campinas");

		// Primeiro a parte técnica é cuidade pelo aeroporto (receber, abastecer e
		// liberar a aeronave para voo)
		aerop.receberAeronave();
		aerop.abastecerAeronave();
		aerop.liberarDecolagem();

		// Depois segue-se normalmente com com o passageiro embarcando, o piloto se
		// apresenta e exibe as informações da rota
		passa.embarcar();
		pilot.exibirInfo();
		rota.exibirRota();

		// Então o avião decola e é exibido informação durante o voo
		aviao.decolar();
		rota.calcularTempoRestante();

		// Um helicóptero também exibe suas informações e decola
		System.out.println("\n");
		helic.exibirInfo();
		helic.decolar();

	}

}
