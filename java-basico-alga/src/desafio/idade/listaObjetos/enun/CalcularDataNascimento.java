package desafio.idade.listaObjetos.enun;

import java.util.Calendar;

public enum CalcularDataNascimento {

        ANOS{
            public Calendar operacao(int dataNascimento){
                Calendar agora = Calendar.getInstance();
                 agora.add(Calendar.DATE, -dataNascimento);
        return agora;
            }
        };

        public abstract Calendar operacao( int dataNascimento);


}
// ver como usar o Enun