package segundaUnd.Atividades_13;

import java.util.ArrayList;
import java.util.Objects;

public class Banco {
	
	private static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static Conta abrirConta(String numero, String titular, double saldoInicial) {
		Conta c = new Conta(numero, titular, saldoInicial);
		System.out.println("A conta " + numero + " pertencente a " + titular + " foi criada com sucesso!");
		contas.add(c);
		return c;
	}
	
	public static Conta buscar(String numero) {
		for(Conta c : contas) {
			boolean contaFoiEncontrada = c.getNumero().equals(numero) ? true : false;
			
			if(contaFoiEncontrada) {
				System.out.println("A conta " + numero + " pertencente a " + c.getTitular() + ", com saldo de R$" + c.getSaldo() + " foi encontrada com sucesso!");
				return c;
			}
		}
		
		System.out.println("Não foi possível encontrar a conta " + numero + " na lista de contas abertas");
		return null;
	}
	
	public static void transferirEntre(String numOrigem, String numDestino, double valor) {
		Conta contaOrigem = buscar(numOrigem);
		Conta contaDestino = buscar(numDestino);
		
		if(Objects.nonNull(contaOrigem)) {
			if(Objects.nonNull(contaDestino)) {
				try {
					contaOrigem.transferir(contaDestino, valor);
				} catch (OperacaoNaoPermitidaException e) {
					e.printStackTrace();
				} catch (ValorInvalidoException e) {
					e.printStackTrace();
				} catch (SaldoInsuficienteException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
