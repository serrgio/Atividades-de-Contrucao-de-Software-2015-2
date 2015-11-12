package br.ufg.inf.es.construcao.software.algoritmo5;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo5 {

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

}
