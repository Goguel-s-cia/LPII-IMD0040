package primeiraUnd.Atividades_11.Questao_01;

public class Main {

	public static void main(String[] args) {
		Bebida b1 = new Bebida("Água", 2.5, false);
		Bebida b2 = new Bebida("Vodka", 275, true);
		Lanche l1 = new Lanche("Sorvete", 12.25, false);
		Lanche l2 = new Lanche("Hambúrguer", 25.75, true);
		Higiene h1 = new Higiene("Sabão", 5, false);
		Higiene h2 = new Higiene("Shampoo", 32, true);
		
		Carrinho c = new Carrinho();
		
		c.adicionarProdutos(b1);
		c.adicionarProdutos(b2);
		c.adicionarProdutos(l1);
		c.adicionarProdutos(l2);
		c.adicionarProdutos(h1);
		c.adicionarProdutos(h2);
		
		c.listarProdutos();
		
		System.out.println("\nE o valor total é de R$" + c.calcularTotal());
	}

}
