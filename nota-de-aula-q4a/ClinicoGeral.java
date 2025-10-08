package questao4a;

public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(String nome, String crm, boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(nome, crm, trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println(getNome() + " está receitando medicamentos.");
    }

}
