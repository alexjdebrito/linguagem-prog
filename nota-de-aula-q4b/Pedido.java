package questao4b;

import java.util.Date;

public class Pedido {
    private int numero;
    private Date data;
    private double valorTotal;
    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(int numero, Date data, double valorTotal, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void exibirResumo() {
        System.out.println("\n=== RESUMO DO PEDIDO ===");
        System.out.println("Número: " + numero);
        System.out.println("Data: " + data);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Valor Total: R$ " + valorTotal);
    }
}