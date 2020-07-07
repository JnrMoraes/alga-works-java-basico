package desafio.idade.javaCalendar;
import desafio.idade.entities.Pessoa;

import java.util.Calendar;

public class ExemploCalendarDatas {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setAltura(1.71);
        p1.setDataNascimento(25);

        Calendar resultado = Calendar.getInstance();

// usei cala calcular a data que nasceu a partir da idade atual digitada
        Calendar resuldadoRetroativo = Calendar.getInstance();
        resuldadoRetroativo.add(Calendar.YEAR, -p1.getDataNascimento());

        System.out.printf(  "%tA\n",  resultado);
//Sunday nome semana do dia atual
        System.out.printf("%tB\n",  resultado);
//July nome do mês atual
        System.out.printf("%tc\n",  resultado);
//Sun Jul 02 18:43:35 BRT 2045 *ver oq esta aumentando 20 anos
        System.out.printf("%td\n",  resultado);
//02 dia
        System.out.printf("%tY\n",  resultado);
//2045 ano * ver pq esta aumentando 20 anos
        System.out.printf("%tF\n",  resultado);
//2045-07-02
        System.out.printf("%tD\n",  resultado);
//07/02/45
        System.out.printf("%tr\n",  resultado);
//06:48:08 PM
        System.out.printf("%tT\n",  resultado);
//18:48:08

        System.out.printf("Ano de nascimento: " + "%tY\n",  resuldadoRetroativo);
//1995 * funcinou normal a data quando fez o calculo com o ano


    }




}
