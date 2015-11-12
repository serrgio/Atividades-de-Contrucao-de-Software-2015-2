package br.ufg.inf.es.construcao.software.algoritmo14;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo14 {

    /**
     * Executa o somatorio de um até n seguindo a regra definida em no algoritimo.
     * @param n inteiro maior ou igual 1.
     * @return inteiro resultante da soma.
     */
    public static int somatorio(int n)
    {
        if(n < 1){
            throw new IllegalArgumentException("O valor de n deve ser maior ou igual a 1");
        }

        int i = 1;
        int s = 0;

        while(i <= n){
            int d = 1 + (i * i);
            s = s + (1 / d);
            i++;
        }

        return s;
    }
}
