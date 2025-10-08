package questao3;

public class Filme {
    private String nome;
    private String genero;
    private int ano;
    private int duracao;
    private double somaNotas;
    private int qtdAvaliacoes;

    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0;
        this.qtdAvaliacoes = 0;
    }

    public void exibirDetalhes() {
        System.out.println("\n=== DETALHES DO FILME ===");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Média de avaliações: " + calcularMediaAvaliacoes());
    }

    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação registrada!");
        } else {
            System.out.println("Nota inválida (0 a 10).");
        }
    }

    public double calcularMediaAvaliacoes() {
        return qtdAvaliacoes == 0 ? 0 : somaNotas / qtdAvaliacoes;
    }
}