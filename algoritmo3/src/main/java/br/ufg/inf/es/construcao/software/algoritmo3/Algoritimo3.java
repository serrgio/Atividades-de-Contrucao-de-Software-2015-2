package br.ufg.inf.es.construcao.software.algoritmo3;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo3 {

    /**
     * Executa a soma de todos os valores de 1 até n
     * @param n inteiro valor limite da soma.
     */
    public static int somaNaturais(int n)
    {
        if(n <= 0)
        {
            throw new IllegalArgumentException("A variavel n é menor que o minimo exigido, que é 1.");
        }

        int i = 2;
        int s = 1;

        //executa a soma
        while(i <= n)
        {
            s += i;
            i += 1;
        }

        return s;
    }

}
