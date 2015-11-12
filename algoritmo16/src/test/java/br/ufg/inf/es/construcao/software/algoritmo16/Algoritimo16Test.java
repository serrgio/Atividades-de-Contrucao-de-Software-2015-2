package br.ufg.inf.es.construcao.software.algoritmo16;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo16Test {

    @Test
    public void testFatorial() throws Exception {
        int n = 5;
        assertEquals(120, Algoritimo16.fatorial(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFatorialMenorQue1() throws Exception {
        int n = 0;
        assertEquals(120, Algoritimo16.fatorial(n));
    }


}