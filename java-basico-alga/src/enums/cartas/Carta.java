package enums.cartas;

public class Carta {

    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public void imprirCarta(){
        System.out.println("Sou " + numero + " de " + naipe
                + " e tenho a cor " + naipe.getCor());
    }

}
