package br.ufg.inf.es.construcao.software.algoritmo28;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo28Test {

    @Test
    public void testMod() throws Exception {
        int x = 9;
        int y = 7;
        assertEquals(2, Algoritimo28.mod(x,y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModInvalido() throws Exception {
        int x = 0;
        int y = 0;
        assertEquals(2, Algoritimo28.mod(x,y));
    }
}