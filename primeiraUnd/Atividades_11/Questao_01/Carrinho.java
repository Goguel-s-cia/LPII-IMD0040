package primeiraUnd.Atividades_11.Questao_01;

import java.util.ArrayList;

public class Carrinho {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void adicionarProdutos(Produto p) {
		produtos.add(p);
	}
	
	public double calcularTotal() {
		double total = 0.0;
		
		for(Produto p : produtos ) {
			total += p.getPreco();
		}
		
		if(total>100.0) {
			total -= (total/10);
		}
		
		return total;
	}
	
	public void listarProdutos() {
		System.out.println("No carrinho, tem:");
		produtos.forEach(p -> {
			System.out.println("\n- " + p.getNome() + " e " + p.getState());
		});
	}

}
