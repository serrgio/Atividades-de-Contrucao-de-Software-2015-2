package br.ufg.inf.es.construcao.software.algoritmo22;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo22 {

    /**
     * Verifica se dois numero inteiros são amigos.
     * @param n inteiro maior que 0
     * @param m inteiro maior que 0
     * @return true se os numeros forem amigos e false caso contrario.
     * @throws IllegalArgumentException se algum parametro for menor que 1.
     */
    public static boolean amigos(int n, int m)
    {
        if(n <= 0 || m <= 0){
            throw new IllegalArgumentException("Os parametros devem ser maiores que zero.");
        }

        int sn = somaDivisores(n);
        int sm = somaDivisores(m);

        if(sn == sm)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    /**
     * Soma todos os divisores do inteiro dado.
     * @param n inteiro maior que zero
     * @return inteiro que representa a soma do divisres;
     */
    public static int somaDivisores(int n){

        if(n <=0 ){
            throw new IllegalArgumentException("N deve ser maior que zero.");
        }

        int d = 2;
        int s = 1;

        while (d <= n/2)
        {
            if (mod(n,d) == 0)
            {
                s += d;
            }
            d++;
        }
        return s;
    }

    /**
     * Verifica o modulo entre dois inteiro.
     * @param x inteiro maior que 0.
     * @param y inteiro maior ou igual a zero.
     * @return inteiro com o resto da divisão entre x e y;
     */
    public static int mod(int x, int y)
    {
        if(x <= 0 || y < 0){
            throw new IllegalArgumentException("X deve ser maior que zero, e Y deve ser maior ou igual a zero.");
        }

        int s = x;
        while (s >= y)
        {
            s = s - y;
        }

        return s;
    }



}
