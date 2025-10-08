package questao4a;

public class Cirurgiao extends Medico {

    public Cirurgiao(String nome, String crm, boolean trabalhaNoHospital) {
        super(nome, crm, trabalhaNoHospital);
    }

    @Override
    public void tratarPaciente() {
        System.out.println(getNome() + " está avaliando o paciente para cirurgia.");
    }

    public void fazerCirurgia() {
        System.out.println(getNome() + " está realizando uma cirurgia complexa.");
    }
}