package segundaUnd.Atividades_17;

public class Main {

	public static void main(String[] args) {
		Repositorio<Cliente> repoCliente = new Repositorio<Cliente>();
		Repositorio<Pedido> repoPedido = new Repositorio<Pedido>();
		Repositorio<Servico> repoServico = new Repositorio<Servico>();
		
		Cliente c1 = new Cliente(1, "João", "84958631457");
		Pedido p1 = new Pedido(1, "João", "Passeio com cão", "Pendente");
		
		try {
			ObrigatorioValidator.validate(p1);
			repoPedido.inserir(p1);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(p1.getClienteNome());
	}

}
