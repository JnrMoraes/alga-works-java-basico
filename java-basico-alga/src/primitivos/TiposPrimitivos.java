package primitivos;

public class TiposPrimitivos {
    public static void main (String [] args){

        double precoProduto = 9.33;
        boolean alunoMatriculado = true; //forma literal
        boolean clienteBloqueado = false;

        char turmaAluno = 'A';
        char simbolo = '@';

        long populacaoUberlandia = 650000;
        long populacaoMundial = 7000000000L; //literal diretamente do tipo long, pode ser L maisculo ou minusculo

        float saldoConta = 1030.43f;//esperado um literal do tipo double, mas com um f no final arruma a situação

//        BigDecimal - usado melhor para representar valores monetários

    }
}
/*
    char  - 16 bits tamanho menor valor 0 , maior valor 2 elevado a 16-1
    byte  - 8  bits tamanho menor valor -2 elevado a 7, maior valor 2 elevado 7-1
    short - 16 bits tamanho menor valor -2 elevado a 15, maior valor 2 elevado 15-1
    int   - 32 bits tamanho menor valor -2 elevado a 31, maior valor 2 elevado 31-1
    long  - 64 bits tamanho menor valor -2 elevado a 63, maior valor 2 elevado 63-1
    float - 32 bits
    double - 64 bits
*/
