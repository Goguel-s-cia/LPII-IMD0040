package segundaUnd.Atividades_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Set<Aluno> alunos = new HashSet<>();

		while (true) {
            System.out.println("\n--- CADASTRO DE ALUNOS ---");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar um aluno");
            System.out.println("2 - Listar os alunos cadastrados em ordem alfabética");
            System.out.println("3 - Buscar aluno pela matrícula");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nDigite a matrícula do aluno:");
                    String matricula = scanner.nextLine();
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();

                    Aluno novoAluno = new Aluno(matricula, nome);

                    if (alunos.add(novoAluno)) {
                        System.out.println("\nAluno cadastrado com sucesso!");
                    } else {
                        System.out.println("\nErro: Matrícula já existente. O aluno não foi cadastrado.");
                    }
                    break;

                case "2":
                    System.out.println("\n--- LISTA DE ALUNOS ---");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        List<Aluno> alunosOrdenados = new ArrayList<>(alunos);
                        Collections.sort(alunosOrdenados); 

                        for (Aluno a : alunosOrdenados) {
                            System.out.println(a); 
                        }
                    }
                    break;

                case "3":
                    System.out.println("\n--- BUSCAR ALUNO ---");
                     if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado para buscar.");
                        break;
                    }
                    System.out.println("Digite a matrícula do aluno que deseja buscar:");
                    String matriculaBusca = scanner.nextLine();

                    Aluno alunoEncontrado = null;
                    for (Aluno a : alunos) {
                        if (a.getMatricula().equals(matriculaBusca)) {
                            alunoEncontrado = a;
                            break; 
                        }
                    }

                    if (alunoEncontrado != null) {
                        System.out.println("\nAluno encontrado:");
                        System.out.println(alunoEncontrado);
                    } else {
                        System.out.println("\nAluno com a matrícula '" + matriculaBusca + "' não foi encontrado.");
                    }
                    break;
                
                case "0":
                    System.out.println("\nEncerrando o programa...");
                    scanner.close(); 
                    return; 

                default:
                    System.out.println("\nOpção inválida. Por favor, tente novamente.");
            }
        }
	}
}
