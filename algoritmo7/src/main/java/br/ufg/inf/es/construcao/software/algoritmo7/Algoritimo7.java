package br.ufg.inf.es.construcao.software.algoritmo7;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo7 {

    /**
     * Verifica se um numero possui a propriedade 3025
     * @param n numero inteiro compreendido entre 0 e 9999
     * @return true caso a propriedade seja encontrada.
     * @throws IllegalArgumentException se n não estiver entre 0 e 9999
     */
    public static boolean propriedade3025(int n)
    {
        if(n < 0 || n > 9999){
            throw new IllegalArgumentException("N deve estar entre 0 e 9999 (inclusive)");
        }

        int i = n / 100;
        int j = n % 100;

        if((i + j) * (i + j) == n){
            return true;
        }else{
            return false;
        }
    }
}
