package br.ufg.inf.es.construcao.software.algoritmo25;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo25 {

    /**
     * Divide subtrações
     * @param x inteiro maior ou igual a 0
     * @param y inteiro maior que zero
     * @return inteiro.
     */
    public static int divideSubtracoes(int x, int y){

        if(x < 0 || y <= 0){
            throw new IllegalArgumentException("X deve ser maior ou igual a zero, e y deve ser maior que zero.");
        }

        int d = 0;
        int s = x;

        while(s >= x){
            s -= y;
            d++;
        }
        return d;
    }
}
