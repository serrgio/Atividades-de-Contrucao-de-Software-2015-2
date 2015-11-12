package br.ufg.inf.es.construcao.software.algoritmo24;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo24Test {

    @Test
    public void testDivideSoma() throws Exception {
        int x =  3;
        int y = 6;
        assertEquals(0,Algoritimo24.divideSoma(x,y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideSomaInvalido() throws Exception {
        int x =  -1;
        int y = 0;
        assertEquals(0,Algoritimo24.divideSoma(x,y));
    }
}