package questao4b;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("___ CADASTRO DE CLIENTE ___");
        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente, cpf);

        System.out.println("\n___ CADASTRO DE VENDEDOR ___");
        System.out.print("Nome do vendedor: ");
        String nomeVendedor = sc.nextLine();
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();
        Vendedor vendedor = new Vendedor(nomeVendedor, matricula);

        System.out.println("\n___ REGISTRO DE PEDIDO ___");
        System.out.print("Número do pedido: ");
        int numero = sc.nextInt();
        System.out.print("Valor total: R$ ");
        double valor = sc.nextDouble();

        Pedido pedido = new Pedido(numero, new Date(), valor, cliente, vendedor);

        cliente.exibirDados();
        vendedor.exibirDados();
        pedido.exibirResumo();

        sc.close();
    }
}
