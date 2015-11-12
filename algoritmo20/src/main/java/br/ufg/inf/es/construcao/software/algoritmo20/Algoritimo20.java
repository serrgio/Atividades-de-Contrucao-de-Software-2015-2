package br.ufg.inf.es.construcao.software.algoritmo20;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo20 {

    /**
     * Calcula a proporção aurea para os valores passados.
     * @param t1 double maior que 0
     * @param t2 double maior que t1
     * @param fator inteiro maior que 0
     * @return double representando a razao aurea.
     * @throws IllegalArgumentException caso os valores nã seja compativeis
     */
    public static double razaoAurea(double t1, double t2, int fator)
    {
        if(t1 <= 0){
            throw new IllegalArgumentException("T1 deve ser maior que 0");
        }else if(t2 <= t1){
            throw new IllegalArgumentException("T2 deve ser maior que T1");
        }else if(fator <= 0){
            throw new IllegalArgumentException("o fator deve ser maior que zero");
        }

        double corrente = t2;
        double anterior = t1;
        int i = 1;

        while(i < fator){
            corrente += anterior;
            anterior = corrente - anterior;
            i++;
        }

        return corrente / anterior;

    }
}
