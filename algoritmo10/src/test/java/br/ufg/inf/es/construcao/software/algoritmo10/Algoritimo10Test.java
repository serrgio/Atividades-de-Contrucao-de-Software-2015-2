package br.ufg.inf.es.construcao.software.algoritmo10;

import org.junit.Test;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo10Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCrivoEratostenesComNInvalido() throws Exception {
        int n = -1;
        int [] a = {1,2,3,4,5};
        Algoritimo10.crivoEratostenes(a,n);
    }
}