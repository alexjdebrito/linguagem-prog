package questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salário bruto: ");
        double salario = sc.nextDouble();

        Funcionario f = new Funcionario(matricula, nome, salario);
        f.exibirContracheque();

        sc.close();
    }
}
