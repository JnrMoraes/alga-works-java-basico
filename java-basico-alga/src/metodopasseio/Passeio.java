package metodopasseio;

public class Passeio {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Jose";

        p1.cachorro = new Cachorro();

        p1.cachorro.nome = "Bob";
        p1.cachorro.raca = "Vira-lata";
        p1.cachorro.idade = 10;
        p1.cachorro.sexo = 'F';

        Caminhada caminhada = new Caminhada();
        caminhada.andar(p1);

    }

}
