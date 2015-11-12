package br.ufg.inf.es.construcao.software.algoritmo23;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo23Test {

    @Test
    public void testSomaDivisores() throws Exception {
        int n = 10;
        assertEquals(8,Algoritimo23.somaDivisores(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSomaDivisoresInvalido() throws Exception {
        int n = 0;
        assertEquals(8,Algoritimo23.somaDivisores(n));
    }
}