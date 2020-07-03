package enums.cartas;

public enum Naipe {

    OURO("Vermelho"),
    PAUS("Preto"),
    ESPADA("Vermelho"),
    COPAS("Preto");

    private String cor;

    Naipe(String cor) {
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

}
