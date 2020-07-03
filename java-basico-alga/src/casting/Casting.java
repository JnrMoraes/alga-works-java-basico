package casting;

public class Casting {
    public static void main (String[] args){

    //casting
    long x = 10;
    int y = (int) x; //(int) a frente força o compilador a aceitar, mesmo com perda de precisão
    System.out.println(y); //10

    long n = 930000035l;
    int z = (int) n;
    System.out.println(z); //710065443 - perda de precisão numerica por não ter espaço na memória

    int b = 3;
    int c = 2;
    float a = x/(float)z;
     System.out.println(a); //1.075 perda de precisao
 }
}