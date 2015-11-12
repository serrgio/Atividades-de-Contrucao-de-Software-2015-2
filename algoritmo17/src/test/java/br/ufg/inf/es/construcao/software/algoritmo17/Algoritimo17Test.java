package br.ufg.inf.es.construcao.software.algoritmo17;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo17Test {

    @Test
    public void testFatorialSoma() throws Exception {
        int n = 5;
        assertEquals(120, Algoritimo17.fatorialSoma(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFatorialSomaMenorQue1() throws Exception {
        int n = 0;
        assertEquals(120, Algoritimo17.fatorialSoma(n));
    }
}