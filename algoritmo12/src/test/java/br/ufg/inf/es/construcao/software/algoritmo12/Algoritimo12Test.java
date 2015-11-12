package br.ufg.inf.es.construcao.software.algoritmo12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo12Test {

    @Test
    public void testMdc2() throws Exception {
        int a = 4;
        int b = 9;
        assertEquals(1, Algoritimo12.mdc2(a,b));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMdc2BZero() throws Exception {
        int a = 9;
        int b = 0;
        assertEquals(1, Algoritimo12.mdc2(a,b));
    }
}