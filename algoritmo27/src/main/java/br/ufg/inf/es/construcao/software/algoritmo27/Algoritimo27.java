package br.ufg.inf.es.construcao.software.algoritmo27;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo27 {

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
