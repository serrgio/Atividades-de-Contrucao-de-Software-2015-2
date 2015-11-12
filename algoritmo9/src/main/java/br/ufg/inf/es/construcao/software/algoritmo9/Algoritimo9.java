package br.ufg.inf.es.construcao.software.algoritmo9;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo9 {

    /**
     * Verifica a primalidade de um dado numero
     * @param n inteiro maior que 1
     * @return true caso  numero seja primo
     * @throws IllegalArgumentException caso n seja menor ou igual a 1
     */
    public static boolean primo(int n)
    {
        if(n <= 1){
            throw new IllegalArgumentException("N deve ser superior a 1");
        }

        int i = 2;
        while(i <= (n - 1)){
            if((n % i) == 0){
                return false;
            }
            i += 1;
        }

        return true;
    }
}
