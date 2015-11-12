package br.ufg.inf.es.construcao.software.algoritmo9;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo9Test {

    @Test
    public void testPrimo() throws Exception {
        int n = 7;
        assertEquals(true,Algoritimo9.primo(n));
    }

    @Test
    public void testPrimoFalse() throws Exception {
        int n = 9;
        assertEquals(false,Algoritimo9.primo(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrimoComNInvalido() throws Exception {
        int n = 1;
        assertEquals(true,Algoritimo9.primo(n));
    }
}