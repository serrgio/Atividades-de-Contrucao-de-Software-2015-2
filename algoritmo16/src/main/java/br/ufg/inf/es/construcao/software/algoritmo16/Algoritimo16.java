package br.ufg.inf.es.construcao.software.algoritmo16;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo16 {

    /**
     * Calcula o fatorial de n.
     * @param n inteiro maior ou igual a 1.
     * @return inteiro representando o fatorial
     * @throws IllegalArgumentException se n for menor que 1.
     */
    public static int fatorial(int n)
    {
        if(n < 1){
            throw new IllegalArgumentException("N precisa ser maior que 1");
        }

        int i = 2;
        int fatorial = 1;

        while(i <= n){
            fatorial *= i;
            i++;
        }

        return fatorial;

    }
}
