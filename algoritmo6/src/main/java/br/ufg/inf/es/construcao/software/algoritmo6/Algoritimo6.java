package br.ufg.inf.es.construcao.software.algoritmo6;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo6 {


    public static int potenciaSoma(int x, int y)
    {
        if(x < 0){
            throw new IllegalArgumentException("X deve ser maior que zero.");
        }
        else if(y <= 1){
            throw new IllegalArgumentException("y deve ser maior que 1.");
        }

        int i = 1;
        int p = x;

        while(i < y){
            p = produto(p, x);
            i += 1;
        }
        return p;
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
