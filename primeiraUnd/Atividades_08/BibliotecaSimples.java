package primeiraUnd.Atividades_08;

public class BibliotecaSimples {

	public static void main(String[] args) {

		Livro l = new Livro("Java: Como Programar");
		Revista r = new Revista("Revista de Tecnologia");
		Dvd d = new Dvd("Filme de Programação");
		
		System.out.println(l.getTitulo() + " - Prazo: " + l.prazoDevolucaoDias() + " dias");
		System.out.println(r.getTitulo() + " - Prazo: " + r.prazoDevolucaoDias() + " dias");
		System.out.println(d.getTitulo() + " - Prazo: " + d.prazoDevolucaoDias() + " dias");
	}

}