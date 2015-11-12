package br.ufg.inf.es.construcao.software.algoritmo14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo14Test {

    @Test
    public void testSomatorio() throws Exception {
        int n = 1;
        assertEquals(0, Algoritimo14.somatorio(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSomatorioNZero() throws Exception {
        int n = 0;
        assertEquals(1, Algoritimo14.somatorio(n));
    }


}