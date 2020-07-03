package enums.operacaoAritmetica;

public class MainOperacao {

    public static void main(String[] args) {

       OperacaoAritmetica op1 = OperacaoAritmetica.ADICAO;

        int resultado1  = op1.operacoes(10, 2);
        System.out.printf("Minha operacao 1 tem : %d%n", resultado1);

        for (OperacaoAritmetica operacaoAritmetica : OperacaoAritmetica.values()) {
            System.out.println(operacaoAritmetica + " -> " +operacaoAritmetica.operacoes(10, 3) );
        }

    }
}
