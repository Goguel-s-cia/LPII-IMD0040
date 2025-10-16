package segundaUnd.Atividades_12;

public class Conta {
	private String numero;
	private String titular;
	private double saldo, limiteDiario;
	
	public Conta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDiario = 500;
	}

	public void depositar(double valor) throws ValorInvalidoException {
		if(valor <= 0) {
			throw new ValorInvalidoException("Valor indicado é inválido para depósito!");
		}
		saldo += valor;
	}
	
	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException, OperacaoNaoPermitidaException {
		if(valor <= 0) {
			throw new ValorInvalidoException("Valor indicado é inválido para saque/transferência!");
		}
		
		if(saldo < valor) {
			throw new SaldoInsuficienteException("Saldo é menor que o valor indicado para saque/tranferência!");
		}
		
		if((limiteDiario - valor) < 0) {
			throw new OperacaoNaoPermitidaException("Operação negada! Saque/transferência ultrapassaria o limite diário!");
		}
		
		limiteDiario -= valor;
		saldo -= valor;
	}
	
	public void transferir(Conta destino, double valor) throws OperacaoNaoPermitidaException, ValorInvalidoException, SaldoInsuficienteException {
		if(destino.getNumero().equals(numero)) {
			throw new OperacaoNaoPermitidaException("A conta de destino de uma transferência não pode ser a mesma de origem!");
		}
		
		sacar(valor);
		destino.depositar(valor);
		
		System.out.println("Saldo da conta de origem após transferência: R$" + saldo);
		System.out.println("Saldo da conta de destino após transferência: R$" + destino.getSaldo());
	}
	
	public void extratoSimpĺes() {
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteDiario() {
		return limiteDiario;
	}

	public void setLimiteDiario(double limiteDiario) {
		this.limiteDiario = limiteDiario;
	}
}
