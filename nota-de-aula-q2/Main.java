package questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria(1, "Cliente 1");
        ContaBancaria conta2 = new ContaBancaria(2, "Cliente 2");

        int opcao;
        do {
            System.out.println("\n___ MENU BANCO ___");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> conta1.consultarSaldo();
                case 2 -> {
                    System.out.print("Valor do depósito: ");
                    conta1.depositar(sc.nextDouble());
                }
                case 3 -> {
                    System.out.print("Valor do saque: ");
                    conta1.sacar(sc.nextDouble());
                }
                case 4 -> {
                    System.out.print("Valor da transferência: ");
                    conta1.transferir(conta2, sc.nextDouble());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
