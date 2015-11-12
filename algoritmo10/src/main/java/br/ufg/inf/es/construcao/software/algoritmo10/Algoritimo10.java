package br.ufg.inf.es.construcao.software.algoritmo10;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo10 {

    /**
     * Executa o algoritimo Crivo de erastotenes
     * @param a array de inteiros.
     * @param n inteiro maior que 1
     * @throws IllegalArgumentException se n for menor ou igual a 1;
     */
    public static void crivoEratostenes(int [] a, int n)
    {
        if(n <= 1){
            throw new IllegalArgumentException("Exige N maior que 1");
        }

        int i = 2;
        while(i <= n/2){
            if(a[i] == 0){
                int c = i + i;
                while (c <= n)
                {
                    a[c] = 1;
                    c += 1;
                }
            }
            i++;
        }
    }
}
