package br.ufg.inf.es.construcao.software.algoritmo21;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo21 {

    /**
     * Verifica de um dado inteiro é um quadrado perfeito.
     * @param k inteiro maior ou igual a 1.
     * @return true caso seja quadrado perfeito.
     */
    public static boolean quadradoPerfeito(int k)
    {
        if(k < 1){
            throw new IllegalArgumentException("K deve ser maior ou igual a 1");
        }

        int i = 1;
        int q = 1;

        while(q < k){
            i += 2;
            q++;
        }

        if(q == k)
        {
            return true;
        }else{
            return false;
        }
    }
}
