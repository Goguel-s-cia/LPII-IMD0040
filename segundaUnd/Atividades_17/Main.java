package segundaUnd.Atividades_17;

public class Main {

	public static void main(String[] args) {

		Pedido p = new Pedido(15, null, "servico", "é");
		
		try {
			ObrigatorioValidator.validate(p);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(p.getClienteNome());
	}

}
