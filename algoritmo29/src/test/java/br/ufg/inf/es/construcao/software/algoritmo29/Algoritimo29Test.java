package br.ufg.inf.es.construcao.software.algoritmo29;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo29Test {

    @Test
    public void testRaizQuadrada() throws Exception {
        int x = 4;
        int i = 4;
        assertEquals(2, Algoritimo29.raizQuadrada(x,i),5);        
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaizQuadradaInvalido() throws Exception {
        int x = 0;
        int i = 0;
        assertEquals(16, Algoritimo29.raizQuadrada(x,i),5);
    }
}