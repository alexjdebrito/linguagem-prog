package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("___ CADASTRAR FILME ___");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Gênero: ");
        String genero = sc.nextLine();
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        System.out.print("Duração (min): ");
        int duracao = sc.nextInt();

        Filme filme = new Filme(nome, genero, ano, duracao);

        int opcao;
        do {
            System.out.println("\n1 - Exibir detalhes");
            System.out.println("2 - Avaliar filme");
            System.out.println("3 - Exibir média");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> filme.exibirDetalhes();
                case 2 -> {
                    System.out.print("Nota (0-10): ");
                    filme.avaliar(sc.nextInt());
                }
                case 3 -> System.out.println("Média: " + filme.calcularMediaAvaliacoes());
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
