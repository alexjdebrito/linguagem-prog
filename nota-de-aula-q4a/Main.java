package questao4a;

public class Main {
    public static void main(String[] args) {
        ClinicoGeral clinico = new ClinicoGeral("Dr. João", "12345", true, true);
        clinico.tratarPaciente();
        clinico.receitar();

        Cirurgiao cirurgiao = new Cirurgiao("Dra. Maria", "67890", true);
        cirurgiao.tratarPaciente();
        cirurgiao.fazerCirurgia();
    }
}
