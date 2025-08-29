package MiniSpotify;

import java.util.Scanner;

import MiniSpotify.Modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de streaming de música!");

        // Cadastro de usuário
        System.out.println("Por favor, cadastre-se para começar.");
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite seu e-mail: ");
        String emailUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nomeUsuario, emailUsuario);
        System.out.println("\nCadastro realizado com sucesso! Bem-vindo(a), " + usuario.getNome() + ".");

        int opcao = 0;
        while (opcao != 9) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Visualizar playlists");
            System.out.println("2. Criar uma nova playlist");
            System.out.println("3. Adicionar mídia a uma playlist");
            System.out.println("4. Remover mídia de uma playlist");
            System.out.println("5. Buscar mídia no catálogo por título");
            System.out.println("6. Buscar mídia no catálogo por artista");
            System.out.println("7. Buscar mídia no catálogo por gênero");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());
            
            switch (opcao) {
                case 1:

                    break;
                case 2:
                    System.out.print("Digite o nome da nova playlist: ");

                    break;
                case 3:
                    System.out.print("Digite o nome da playlist: ");

                    break;
                case 4:
                    System.out.print("Digite o nome da playlist: ");

                    break;
                case 5:
                    System.out.print("Digite o título para buscar: ");

                    break;
                case 6:
                    System.out.print("Digite o nome do artista para buscar: ");

                    break;
                case 7:

                    break;
                case 9:
                    System.out.println("Obrigado por usar o nosso sistema! Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }
        scanner.close();
    }
}
