package br.ufg.inf.es.construcao.software.algoritmo27;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vinicius on 12/11/2015.
 */
public class Algoritimo27Test {

    @Test
    public void testMod() throws Exception {
        int x = 5;
        int y = 3;
        assertEquals(2, Algoritimo27.mod(x, y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModInvalido() throws Exception {
        int x = 0;
        int y = 0;
        assertEquals(2, Algoritimo27.mod(x, y));
    }
}