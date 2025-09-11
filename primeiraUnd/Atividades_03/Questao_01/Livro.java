package primeiraUnd.Atividades_03.Questao_01;

class Livro{

    private String titulo;
    private int ano;
    private Double preco;

    // 1.
    public Livro(String titulo, int ano, Double preco) {
        this.titulo = titulo;
        this.ano = ano;
        this.preco = preco;
    }

    // 2.
    public void setPreco(Double preco) {
        if(preco < 0) {
            System.out.println("Valor negativo. Tente outro");
            return;
        }
        this.preco = preco;
    }

    // 3.
    public void exibirInfo(){
        System.out.println("O título do livro é: " + this.titulo);
        System.out.println("O ano do livro é: " + this.ano);
        System.out.println("O preço do Livro é: " + this.preco + "\n");
    }
}