package br.ufg.inf.es.construcao.software.algoritmo15;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo15 {

    /**
     * Obtém um valor aproximado para pi.
     * @param n valor de precisão para o resultado.
     * @return pi
     * @throws IllegalArgumentException caso n seja menor que 1.
     */
    public static double pi(int n){

        if(n < 1){
            throw new IllegalArgumentException("N precisa ser maior ou igual a 1.");
        }

        int i = 1;
        int s = -1;
        int d = -1;
        double p = 0;

        while(i < n)
        {
            d += 2;
            s = (-1 * s);
            p = p + (4 * s)/d;
            i++;
        }

        return p;
    }
}
