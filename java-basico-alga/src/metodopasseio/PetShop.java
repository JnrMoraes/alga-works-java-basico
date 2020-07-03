package metodopasseio;

public class PetShop {

        public static void main(String[] args) {

            Cachorro cachorro = new Cachorro();

            cachorro.nome = "Bidu";
            cachorro.idade = 3;
            cachorro.raca = "Boxer";
            cachorro.sexo = 'M'; //tipo char aspas simples

            System.out.println("Nome: " + cachorro.nome);
            System.out.println("Idade: " + cachorro.idade);
            System.out.println("Raça: " + cachorro.raca);
            System.out.println("Sexo: " + cachorro.sexo);

        }

    }

