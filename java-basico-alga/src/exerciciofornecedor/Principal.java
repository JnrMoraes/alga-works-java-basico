package exerciciofornecedor;

public class Principal {

    public static void main(String[] args) {
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");

        ContaPagar conta1 = new ContaPagar();
        conta1.setDescricao("Aluguel da matriz");
        conta1.setValor(1230d);
        conta1.setDataVencimento("10/05/2012");
        conta1.setFornecedor(imobiliaria);

        ContaPagar conta2 = new ContaPagar("Compras do mês" , 390d, "19/05/2012", mercado);

        ContaPagar conta3 = new ContaPagar("Aluguel da filial", 700d, "11/05/2012", mercado);

        conta1.pagar();
        conta2.pagar();
        conta3.pagar();

        Somar somando = new Somar();

//usando StringBuilder()  e o append
        System.out.println(new StringBuilder()
                .append("Valor total: ")
                .append(somando.soma(conta1,conta2,conta3))
                .toString()
        );
//        Exception in thread "main" java.util.IllegalFormatConversionException: f != exerciciofornecedor.ContaPagar
//        System.out.println(String.format("Valor Total: %f", conta1,conta2,conta3));

// respondido dia 02/07
       // 5.7. Desafio: objeto this, construtores e JavaBeans
    }
}
