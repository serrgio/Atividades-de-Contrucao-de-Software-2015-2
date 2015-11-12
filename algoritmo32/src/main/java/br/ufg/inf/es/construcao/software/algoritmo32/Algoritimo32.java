package br.ufg.inf.es.construcao.software.algoritmo32;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo32 {

    /**
     * Executa a sequencia de fibonacci.
     * @param n inteiro maior ou igual a zero.
     * @return inteiro representando o ultimo digito da sequencia.
     */
    public static int fibonacci(int n)
    {
        if(n < 0){
            throw new IllegalArgumentException("N deve ser maior ou igual a zero.");
        }

        int anterior = 0;
        int corrente = 1;

        if(n == 0 || n == 1){
            return n;
        }

        int i = 2;

        while(i <= n ){
            int t = corrente;
            corrente += anterior;
            anterior = t;
            i++;
        }

        return corrente;
    }
}
