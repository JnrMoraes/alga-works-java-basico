package desafio.idade.arrayObjeto;

import desafio.idade.entities.Pessoa;

public class ArrayObjetos {


    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[10];

// utilizando metodo for

        for (Pessoa p : pessoas) {
            System.out.println("Nova pessoa laço for:" + pessoas);
        }
//
//// utilizando o metodo length
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Nova pessoa laço for com length:" + pessoas);

        }
        //ver oq pq esta pegando a ref da memoria e não o nome do objeto

    }
}




