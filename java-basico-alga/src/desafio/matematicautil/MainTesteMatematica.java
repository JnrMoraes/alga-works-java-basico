package desafio.matematicautil;

public class MainTesteMatematica {

    public static void main(String[] args) {
        int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
        System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
//refatorar e tratar o zero
        double areaCirculo = MatematicaUtil.calcularAreaCirculo(-18.0);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
