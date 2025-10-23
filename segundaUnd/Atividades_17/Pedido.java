package segundaUnd.Atividades_17;

public class Pedido {
	
	@Obrigatorio
	private int id;
	private String clienteNome;
	private String sevicoDescricao;
	private String status;
	
	public Pedido(int id, String clienteNome, String sevicoDescricao, String status) {
		super();
		this.id = id;
		this.clienteNome = clienteNome;
		this.sevicoDescricao = sevicoDescricao;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClienteNome() {
		return clienteNome;
	}
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	public String getSevicoDescricao() {
		return sevicoDescricao;
	}
	public void setSevicoDescricao(String sevicoDescricao) {
		this.sevicoDescricao = sevicoDescricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
