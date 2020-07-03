package televisorchefe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

            try {
                System.out.print("Informe um canal para a TV: ");
                Integer canal = entrada.nextInt();

                System.out.print("Informe o volume para a TV: ");
                Integer volume = entrada.nextInt();
                System.out.println("-");

                Televisor tv = new Televisor();
                System.out.println("Assistindo TV no canal " + tv.canal + " e com volume " + tv.volume);
                tv.mudarCanal(canal);
                tv.mudarVolume(volume);

            } catch (InputMismatchException e) {
                System.out.println("Informe apenas números inteiros!");
            }

            entrada.close();
        }
}
