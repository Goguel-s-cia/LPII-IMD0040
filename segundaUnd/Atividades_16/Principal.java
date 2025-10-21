package segundaUnd.Atividades_16;

public class Principal {

	public static void main(String[] args) {
		
		Catalogo<String> titulosFilmes = new Catalogo<String>();
		Catalogo<Integer> codProdutos = new Catalogo<Integer>();
		
		titulosFilmes.adicionar("Interestelar");
		titulosFilmes.adicionar("Matrix");
		titulosFilmes.adicionar("O Poderoso Chefão");
		
		codProdutos.adicionar(101);
		codProdutos.adicionar(202);
		codProdutos.adicionar(303);
		
		System.out.println("Catálogo de Filmes:");
		titulosFilmes.listar();
		
		System.out.println("\nCatálogo de Códigos:");
		codProdutos.listar();
	
		System.out.println("\n=== Exibindo via método genérico ===");
		Catalogo.exibirCatalogoGenerico(titulosFilmes);
		Catalogo.exibirCatalogoGenerico(codProdutos);
		
		/* Recurso extra */
		System.out.println("\nBusca de itens:");
		titulosFilmes.buscar("Matrix");
		titulosFilmes.buscar("Harry Potter");
		titulosFilmes.buscar("Senhor dos Anéis");
		codProdutos.buscar(101);
		codProdutos.buscar(404);
		codProdutos.buscar(505);
	}
}
