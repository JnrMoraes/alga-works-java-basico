package desafios.enums;

public class ContaPagar {

    private SituacaoConta situacaoConta;

    public ContaPagar(SituacaoConta situacaoConta) {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

//    public ContaPagar(SituacaoConta situacaoConta) {
//        this.situacaoConta = situacaoConta;
//    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void pagar(){

    }
}
