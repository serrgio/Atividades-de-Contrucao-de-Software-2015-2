package br.ufg.inf.es.construcao.software.algoritmo28;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo28 {

    /**
     * Busca o modulo entre dois numeros.
     * @param x inteiro maior ou igual a zero.
     * @param y inteiro maior que zero
     * @return
     */
    public static int mod(int x, int y){

        if(x <= 0 || y < 0){
            throw new IllegalArgumentException("X deve ser maior ou igual a zero e y deve ser maior que zero.");
        }

        int s = x;
        while(s >= y){
            s -= y;
        }

        return s;
    }

}
