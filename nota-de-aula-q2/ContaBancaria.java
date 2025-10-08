package questao2;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " para " + destino.titular + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }
}