package br.ufg.inf.es.construcao.software.algoritmo13;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo13 {


    /**
     * Descobre o numero harmonico, para um dado inteiro.
     * @param n valor inteiro maior ou igual a 1
     * @return inteiro representando numero harmonico
     * @throws IllegalArgumentException caso n seja menor que 1
     */
    public static int numeroHarmonico(int n){

        if(n < 1){
            throw new IllegalArgumentException("O valor de n deve ser maior ou igual a 1");
        }

        int i = 2;
        int s = 1;
        while (i <= n){
            s = s + (1 / i);
            i++;
        }

        return s;
    }
}
