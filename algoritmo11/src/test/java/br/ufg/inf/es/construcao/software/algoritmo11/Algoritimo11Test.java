package br.ufg.inf.es.construcao.software.algoritmo11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo11Test {

    @Test
    public void testMdc() throws Exception {
        int a = 4;
        int b = 9;
        assertEquals(1, Algoritimo11.mdc(a,b));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMdcBZero() throws Exception {
        int a = 9;
        int b = 0;
        assertEquals(1, Algoritimo11.mdc(a,b));
    }
}