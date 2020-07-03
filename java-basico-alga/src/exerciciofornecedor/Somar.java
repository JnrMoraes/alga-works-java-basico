package exerciciofornecedor;

public class Somar {
    public Double soma(ContaPagar conta1, ContaPagar conta2, ContaPagar conta3){
        Double soma = conta1.getValor() + conta2.getValor() + conta3.getValor();
        return soma;
    }
}
