package enums.operacaoAritmetica;

public enum OperacaoAritmetica {

    ADICAO{
        public int operacoes(int x, int y){
            return x + y;
        }
    },
    SUBTRACAO{
        public int operacoes(int x, int y){
            return x - y;
        }
    },
    MULTIPLICACAO{
        public int operacoes(int x, int y) {
            return 0;
        }
    },
    DIVISAO{
        public int operacoes(int x, int y) {
            return 0;
        }
    };

    public abstract int operacoes(int x, int y);

}
