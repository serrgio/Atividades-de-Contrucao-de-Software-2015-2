package br.ufg.inf.es.construcao.software.algoritmo19;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo19 {

    /**
     * encontra o valor do log de n na base k
     * @param n inteiro para calculo
     * @param k base
     * @return inteiro representando log.
     */
    public static double logN(int n, int k)
    {
        if(n < 1){
            throw new IllegalArgumentException("N deve ser maior ou igual a 1.");
        }else if(k < 2){
            throw new IllegalArgumentException("K deve ser maior ou igual a 2");
        }

        int i = 2;
        double e = n + 1;
        double t = n;

        while (i <= k){
            t = (t * n)/i;
            e += t;
            i++;
        }

        return e;
    }

}
