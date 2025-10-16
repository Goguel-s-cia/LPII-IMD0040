package segundaUnd.Atividades_15;

import java.util.Scanner;

public class Menu {
	
	public static void exibirMenu() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
	        System.out.println("\n========== MENU ==========");
	        System.out.println("1) Alunos - Adicionar");
	        System.out.println("2) Alunos - Listar");
	        System.out.println("3) Alunos - Obter por índice");
	        System.out.println("4) Alunos - Remover por índice");
	        System.out.println("5) Alunos - Limpar");
	        System.out.println("--------------------------");
	        System.out.println("6) Produtos - Adicionar");
	        System.out.println("7) Produtos - Listar");
	        System.out.println("8) Produtos - Obter por índice");
	        System.out.println("9) Produtos - Remover por índice");
	        System.out.println("10) Produtos - Limpar");
	        System.out.println("--------------------------");
	        System.out.println("11) Demonstração Par<K, V> e método genérico");
	        System.out.println("0) Sair");
	        System.out.print("Escolha uma opção: ");
	        String opcao = scanner.nextLine();
	
	        switch (opcao) {
	            case "1":
	                break;
	            case "2":
	                break;
	            case "3":
	                break;
	            case "4":
	                break;
	            case "5":
	                break;
	            case "6":
	                break;
	            case "7":
	                break;
	            case "8":
	                break;
	            case "9":
	                break;
	            case "10":
	                break;
	
	            case "11":
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
