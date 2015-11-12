package br.ufg.inf.es.construcao.software.algoritmo18;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo18 {

    /**
     * encontra o valor do log de n na base k
     * @param n inteiro para calculo
     * @param k base
     * @return inteiro representando log.
     */
    public static double lofNaturalSimples(int n, int k)
    {
        if(n < 1){
            throw new IllegalArgumentException("N deve ser maior ou igual a 1.");
        }else if(k < 2){
            throw new IllegalArgumentException("K deve ser maior ou igual a 2");
        }

        int i = 2;
        double e = n + 1;

        while (i <= k){
            int p = potencia(n,i);
            int f = fatorial(i);
            e = e + p/f;
            i++;
        }

        return e;
    }

    /**
     * Eleva x a potencia de y
     * @param x base
     * @param y potencia
     * @return inteiro representando a
     * @throws IllegalArgumentException caso algum dos argumentos seja menor que 1.
     */
    public static int potencia(int x ,int y)
    {
        if(x <= 0 || y <= 0){
            throw new IllegalArgumentException("Os parametros devem ser maiores que zero.");
        }

        int i = 1;
        int p = 1;

        while(i <= y){
            p *= x;
            i += 1;
        }

        return p;
    }

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
