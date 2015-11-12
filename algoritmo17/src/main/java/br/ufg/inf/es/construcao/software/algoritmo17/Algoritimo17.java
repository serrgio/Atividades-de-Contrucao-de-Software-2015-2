package br.ufg.inf.es.construcao.software.algoritmo17;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo17 {

    /**
     * Calcula o fatorial de n.
     * @param n inteiro maior ou igual a 1.
     * @return inteiro representando o fatorial
     * @throws IllegalArgumentException se n for menor que 1.
     */
    public static int fatorialSoma(int n)
    {
        if(n < 1){
            throw new IllegalArgumentException("N precisa ser maior que 1");
        }

        int i = 2;
        int fatorial = 1;

        while(i <= n){
            fatorial =produto(fatorial,i);
            i++;
        }

        return fatorial;
    }

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
