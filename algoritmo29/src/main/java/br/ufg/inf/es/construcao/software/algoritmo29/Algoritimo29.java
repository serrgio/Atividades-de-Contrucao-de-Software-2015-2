package br.ufg.inf.es.construcao.software.algoritmo29;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo29 {

    /**
     * Busca a raiz quadrada de determinado numero.
     * @param n inteiro maior que
     * @param i inteiro
     * @return raiza quadrada.
     */
    public static double raizQuadrada(int n, int i)
    {
        if(n <= 0 )
        {
            throw new IllegalArgumentException("N deve ser maior que zero");
        }

        double r = 1;
        while (i >= 0){
            r = (r + n/r)/2;
            i--;
        }
        return r;
    }
}
