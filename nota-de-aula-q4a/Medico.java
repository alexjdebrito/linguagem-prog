package questao4a;

public class Medico {
    private String nome;
    private String crm;
    private boolean trabalhaNoHospital;

    public Medico(String nome, String crm, boolean trabalhaNoHospital) {
        this.nome = nome;
        this.crm = crm;
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
        System.out.println(nome + " está tratando um paciente.");
    }

    public String getNome() {
        return nome;
    }
}