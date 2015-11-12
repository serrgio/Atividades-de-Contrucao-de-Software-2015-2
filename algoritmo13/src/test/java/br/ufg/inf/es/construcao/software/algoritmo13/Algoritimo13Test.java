package br.ufg.inf.es.construcao.software.algoritmo13;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo13Test {

    @Test
    public void testNumeroHarmonico() throws Exception {
        int n = 1;
        assertEquals(1,Algoritimo13.numeroHarmonico(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroHarmonicoComNZero() throws Exception {
        int n = 0;
        assertEquals(1,Algoritimo13.numeroHarmonico(n));
    }
}