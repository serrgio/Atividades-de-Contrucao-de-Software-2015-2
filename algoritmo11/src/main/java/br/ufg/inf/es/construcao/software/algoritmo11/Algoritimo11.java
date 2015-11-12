package br.ufg.inf.es.construcao.software.algoritmo11;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo11 {

    /**
     * Encontra o maximo divisor comum entre a e b.
     * @param a inteiro
     * @param b inteiro
     * @return inteiro mdc entre a e b
     * @throws IllegalArgumentException caso  b seja menor que 1
     */
    public static int mdc(int a, int b)
    {
        if(a < b){ //troca os valores de a e b
            int t = a;
            a = b;
            b = t;
        }else if(b <= 0){
            throw new IllegalArgumentException("b precisa ser maior que 1");
        }

        while(b != 0){
            int m = a % b;
            a = b;
            b = m;
        }
        return a;
    }
}
