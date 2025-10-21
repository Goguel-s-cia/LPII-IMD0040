package segundaUnd.Atividades_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Catalogo<T> {
	private List<T> itens = new ArrayList<T>();
	
	public void adicionar(T item) {
		if(Objects.nonNull(item)) {
			itens.add(item);
			return;
		}
		System.out.println("Falha ao adicionar item!");
	}
	
	public void listar() {
		for (T t : itens) {
			System.out.println(t);
		}
	}
	
	public int tamanho() {
		return itens.size();
	}
	
	/* Recurso extra */
	public void buscar(T busca) {
		for (T t : itens) {
			if(t.equals(busca)) {
				System.out.println("Item \"" + busca + "\" encontado com sucesso!");
				return;
			}
		}
		System.out.println("Item \"" + busca + "\" não encontado!");
	}
	
	public static void exibirCatalogoGenerico(Catalogo<?> catalogo) {
		System.out.println("Exibindo catálogo genérico:");
		catalogo.listar();
		System.out.println("Total de itens: " + catalogo.tamanho());
		System.out.println("-----------------------------");
	}
}
