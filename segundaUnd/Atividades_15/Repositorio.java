package segundaUnd.Atividades_15;

import java.util.ArrayList;

public class Repositorio<T> {
	private ArrayList<T> lista;
	
	public void adicionar(T elemento) {
		lista.add(elemento);
	}
	
	public T obter(int indice) {
		for(T item : lista) {
			if((((Aluno) item).getMatricula() == indice) || (((Produto) item).getCodigo() == indice)) {
				return item;
			}
		}
		return null;
	}
	
	public boolean removerPorIndice(int indice) {
		return (boolean) lista.remove(indice);
	}
	
	public int tamanho() {
		return lista.size();
	}
	
	public void limpar() {
		lista.clear();
	}
	
	public void listar() {
		for(T item : lista) {
			Util.imprimir(item);
		}
	}

}
