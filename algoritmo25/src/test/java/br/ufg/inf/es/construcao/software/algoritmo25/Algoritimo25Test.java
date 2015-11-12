package br.ufg.inf.es.construcao.software.algoritmo25;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo25Test {

    @Test
    public void testDivideSubtracoes() throws Exception {
        int x = 90;
        int y = 74;
        assertEquals(1,Algoritimo25.divideSubtracoes(x,y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideSubtracoesInvalido() throws Exception {
        int x = 0;
        int y = 0;
        assertEquals(1,Algoritimo25.divideSubtracoes(x,y));
    }
}