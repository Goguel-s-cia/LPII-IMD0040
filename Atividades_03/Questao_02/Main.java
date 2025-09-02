package primeiraUnd.Atividades_03.Questao_02;

/*
 *
 *  2 - CONTA BANCÁRIA
 *
 */


public class Main
{
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.getSaldo();
		
		c1.depositar(50.50);
		c1.getSaldo();
		
		c1.sacar(100.0);
		c1.getSaldo();
		
		// Tentativa esperada que dê erro(sacar além do saldo disponível)
		c1.sacar(200.0);
		c1.getSaldo();
		
		c1.depositar(500.75);
		c1.getSaldo();
		
	}
}


