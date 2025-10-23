package segundaUnd.Atividades_17;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
	private List<T> lista = new ArrayList<T>();
	
	public void inserir(T item) {
		lista.add(item);
	}
	
	
}
