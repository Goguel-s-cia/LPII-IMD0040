package primeiraUnd.Atividades_02;

import java.util.Scanner;

public class Main
{
public static void main(String[] args) {

System.out.println("Seja bem vindo(a) ao Programa Introdutório 2.0\n");
System.out.println("Este programa tem como objetivo treinar alguns conceitos");
System.out.println("de programação, como:");
System.out.println("- Diversos tipos de laços de repetição");
System.out.println("- Break e continue");
System.out.println("- Vetores");
System.out.println("- Matrizes\n");
System.out.println("E esse treinamento acontece de forma interativa.");
System.out.println("Através de algumas perguntas todos esses conceitos serão trabalhados");
System.out.println("\nVamos lá!\n");

// Obs: Optei por fazer o vetor numérico e a matriz literal,
// para que não houvesse muita repetição desnecessária,
// visto que são bem semelhantes.

// Vetor
int[] numeros = new int[10];

        System.out.println("\nInicialmente temos um vetor de " + numeros.length + " posições");
        System.out.println("Seus valores iniciais são: ");
       
        // Primeira forma de laço de repetição
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Na posição " + (i+1) + ", " + numeros[i]);
        }
       
        System.out.println("\nOu seja, ele começou com todos seus valores iguais a zero");
       
        System.out.println("\nVamos ver se você consegue sair do loop agora: ");
        Scanner leitor = new Scanner(System.in);
        int linha;
        int tentativa = 1;
       
        // Segunda forma de laço de repetição
        do{
            System.out.println("\nDigite 0 para sair,");
            System.out.println("Ou qualquer outro número para continuar no loop");
            System.out.println("Tentativa nº " + tentativa);
            tentativa += 1;
            linha = leitor.nextInt();
        }while(linha != 0);

System.out.println("\nMuito bem, você conseguiu sair do loop!");
System.out.println("Agora vamos para outro loop para preencher nosso vetor\n");
int contador = 0;

// Terceira  forma de laço de repetição
while(contador < 10) {
   numeros[contador] = contador * contador;
   contador += 1;
}
System.out.println("Atribuindo valores...");
System.out.println("Valores atribuídos!");
System.out.println("Agora vamos verificá-los, temos os seguintes valores no nosso vetor: ");

// Quarta forma de laço de repetição
for(int numero : numeros) {
   System.out.println(numero);
}
 
        System.out.println("\nParabéns! Você passou pelos 4 tipos de laços de repetição");
       
        // Uso do continue
        System.out.println("\nAgora eu quero imprimir apenas os valores pares presentes no meu vetor, estes são:");
        for(int numero : numeros) {
  if (numero % 2 != 0) {
                continue;
            }
            System.out.println(numero);
}
 
        // Uso do break
        System.out.println("\nAgora eu quero que você tente adivinhar no número que eu estou pensando");
        System.out.println("Vamos lá, é um número que está de 0 a 10, tente um chute:");
        while(true) {
            linha = leitor.nextInt();
            if(linha == 4){
                break;
            }
            System.out.println("Errooou, tente outro número!");
        }
       
        System.out.println("\nAeee, você leu minha mente!\n\n");
       
        System.out.println("Agora vamos ver algo além do vetor, matriz!");
        System.out.println("Temos essa seguinte matriz:");
       
        // Matriz
        String[][] matrizStrings = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "H", "I"}
        };
               
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Na "+ (i+1) + "ª linha, e na " + (j+1) + "ª coluna, temos o elemento:");
                System.out.println(matrizStrings[i][j] + "\n");
            }
        }
       
       
}
}