package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade do seu produto");
        int quantidadeProduto = scanner.nextInt();
        scanner.nextLine();

        Estoque estoque = new Estoque();
        estoque.produtos = new Produto[quantidadeProduto];

        for (int i = 0; i < estoque.produtos.length; i++) {
            estoque.produtos[i] = new Produto();

            System.out.println("\nProduto " + (i + 1));
            System.out.println("------------------------");
// arrumar erro na exception apos inserir o 2 produto
            System.out.println("Descrição: ");
            estoque.produtos[i].descricao = scanner.nextLine();

            try {
                System.out.println("Quantidade: ");
                estoque.produtos[i].quantidade = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Erro no valor");
            }

            try {
                System.out.println("Preço: ");
                estoque.produtos[i].preco = scanner.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("Erro no preco");
            }
        }

        estoque.listarProdutos();
        scanner.close();
    }

}


