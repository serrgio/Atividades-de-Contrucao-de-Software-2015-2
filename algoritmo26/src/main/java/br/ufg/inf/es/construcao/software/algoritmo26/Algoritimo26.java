package br.ufg.inf.es.construcao.software.algoritmo26;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo26 {

    /**
     * Verifica o modulo entre x e y
     * @param x inteiro maior que 0
     * @param y inteiro maior que 0
     * @return
     */
    public static int modSimples(int x, int y){

        if(x <= 0 || y <= 0){
            throw new IllegalArgumentException("Os parametros devem ser maiores que zero.");
        }
        int d = divideSubtracoes(x,y);
        return x - (d * y);
    }

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
