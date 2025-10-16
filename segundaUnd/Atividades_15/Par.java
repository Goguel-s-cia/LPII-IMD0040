package segundaUnd.Atividades_15;

public class Par<K, V> {
	private K chave;
	private V valor;
	
	public Par(K chave, V valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Par{chave=" + chave + ", valor=" + valor + "}";
	}
	
	
	
}
