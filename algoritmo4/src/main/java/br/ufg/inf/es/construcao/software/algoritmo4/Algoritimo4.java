package br.ufg.inf.es.construcao.software.algoritmo4;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo4 {

    /**
     * Efetua a multiplicação de dois valores inteiros.
     * @param a numero inteiro maior que zero
     * @param b numero inteiro maior que zero
     * @return produto de a e b
     * @throws IllegalArgumentException se algum valor for menor ou igual a zero.
     */
    public static int produto(int a, int b)    {

        if(a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Os valores de parametro devem ser maiores que zero");
        }

        int i = 1;
        int s = 0;

        while(i <= b)        {
            s += a;
            i += 1;
        }

        return s;
    }


}
