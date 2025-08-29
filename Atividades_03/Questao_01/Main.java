/*
 *
 *  1 - LOJA DE LIVROS
 *
 */

public class Main
{
	public static void main(String[] args) {
		
		Livro l1 = new Livro("A Sociedade do Anel", 1998, 120.00);
		Livro l2 = new Livro("As Duas Torres", 1999, 140.50);
		
		l1.setPreco(149.99);
		
		l1.exibirInfo();
		l2.exibirInfo();
		
	}
}