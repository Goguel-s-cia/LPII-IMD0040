package segundaUnd.Atividades_12;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nCriação de contas:");
		Banco.abrirConta("1234", "José", 600);
		Banco.abrirConta("5678", "João", 800);
		
		System.out.println("\nBusca de contas:");
		Banco.buscar("1234");
		Banco.buscar("5678");
		Banco.buscar("5129");
		
		System.out.println("\nTransferência entre contas:");
		
		// Alguns casos de falha, para testar, basta descomentar a linha do caso e rodar
		// Banco.transferirEntre("5678", "1234", 3000);
		// Banco.transferirEntre("5678", "1234", 0);
		// Banco.transferirEntre("5678", "1234", -50);
		// Banco.transferirEntre("5678", "5678", 30);
		
		// Caso válido
		Banco.transferirEntre("5678", "1234", 100);
	}

}
