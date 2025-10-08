package questao4b;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void exibirDados() {
        System.out.println("\n=== DADOS DO CLIENTE ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}