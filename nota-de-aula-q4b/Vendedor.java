package questao4b;

public class Vendedor {
    private String nome;
    private String matricula;

    public Vendedor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void exibirDados() {
        System.out.println("\n=== DADOS DO VENDEDOR ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}