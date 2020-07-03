package arrays;

public class Produto {
        String descricao;
        int quantidade;
        double preco;
        
        void descrever(){
            System.out.println();
            System.out.printf("");
            System.out.println("Produto.descrever");
            System.out.println("descricao: " + descricao
                                +"quantidade: " + quantidade
                                +"preço: " + preco
            );
        }
}
