package primeiraUnd.Atividades_01;

import java.util.Scanner;

public class Main{
   
    public enum Categorias {
            PRIMEIRA("Bebê", 1),
            SEGUNDA("Criança", 2),
            TERCEIRA("Pré-adolescente", 3),
            QUARTA("Adolescente", 4),
            QUINTA("Jovem adulto", 5),
            SEXTA("Adulto", 6),
            SETIMA("Idoso", 7),
            OITAVA("Ancião", 8);
           
        private final String nomeExtenso;
        private final int numero;
       
        Categorias(String nomeExtenso, int numero) {
            this.nomeExtenso = nomeExtenso;
            this.numero = numero;
        }

        public String getNomeExtenso() {
            return nomeExtenso;
        }

        public int getNumero() {
            return numero;
        }
    }
       
public static void main(String[] args) {
   
   System.out.println("Olá, esse é o início do programa de boas-vindas à disciplina de LPII\n");
   
        Scanner scanner = new Scanner(System.in);
        String leitor;
        System.out.println("Digite seu nome completo: ");
        leitor = scanner.nextLine();
        String nome = leitor;
        System.out.println("Seja bem vindo(a), " + nome + ". É um prazer receber você!\n");
       
       
        System.out.println("E qual a sua idade, em anos, " + nome + "?");
        leitor = scanner.nextLine();
        Double idadeLida = Double.parseDouble(leitor);
        // Conversão de Double para int
        int idade = (int) Math.floor(idadeLida); // Garante que se o usuário digitar uma idade decimal, não quebra o código e pega só a parte inteira
        System.out.println("Ah, então você tem "+ idade + " anos, que bacana!");
       
        String faseDaVida = "";
     
        if(idade < 1) {
            faseDaVida = Categorias.PRIMEIRA.getNomeExtenso();
        }else if(idade < 10){
            faseDaVida = Categorias.SEGUNDA.getNomeExtenso();
        }else if(idade < 12){
            faseDaVida = Categorias.TERCEIRA.getNomeExtenso();
        }else if(idade < 18){
            faseDaVida = Categorias.QUARTA.getNomeExtenso();
        }else if(idade < 22){
            faseDaVida = Categorias.QUINTA.getNomeExtenso();
        }else if(idade < 60){
            faseDaVida = Categorias.SEXTA.getNomeExtenso();
        }else if(idade < 90) {
            faseDaVida = Categorias.SETIMA.getNomeExtenso();
        }else{
            faseDaVida = Categorias.OITAVA.getNomeExtenso();
        }

        System.out.println("E a sua fase da vida é: " + faseDaVida + "\n");
       
        System.out.println("Me diz, qual seu gênero?");
        System.out.println("Digite:");
        System.out.println("M para masculino");
        System.out.println("F para feminino");
        System.out.println("O para outro\n");
        leitor = scanner.nextLine();

        switch(leitor) {
            case "M": System.out.println("Certo. Você é do gênero masculino então!");
                break;
            case "F": System.out.println("Certo. Você é do gênero feminino então!");
                break;
            case "O": System.out.println("Certo. Você é de outro gênero então!");
                break;
            default: System.out.println("Parece que você digitou uma opcão inválida :(");
                break;
        }
       
        System.out.println("\nVamos calcular seu IMC agora?");
        System.out.println("Digite sua altura, em metros(Use . para separar as casas): ");
        leitor = scanner.nextLine();
        Double alturaLida = Double.parseDouble(leitor); // Conversão de String para Double
        System.out.println("\nDigite seu peso em quilos: ");
        leitor = scanner.nextLine();
        Double pesoLido = Double.parseDouble(leitor);
       
       // Cálculo matemático
        Double imc = (pesoLido/(alturaLida * alturaLida));
       
        if(imc < 18.5){
            System.out.println("\nVocê está abaixo do peso ideal, e seu IMC é: " + String.format("%.2f", imc));
        }else if(imc < 24.9) {
            System.out.println("\nVocê está no peso ideal, e seu IMC é: " + String.format("%.2f", imc));
        }else{
            System.out.println("\nVocê está além do peso ideal, e seu IMC é: " + String.format("%.2f", imc));
        }
       
       
scanner.close();
}

}