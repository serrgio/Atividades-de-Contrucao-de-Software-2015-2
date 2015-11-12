package br.ufg.inf.es.construcao.software.algoritmo26;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo26Test {

    @Test
    public void testModSimples() throws Exception {
        int x = 7;
        int y = 5;

        assertEquals(2,Algoritimo26.modSimples(x,y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModSimplesValoresInvalidos() throws Exception {
        int x = 0;
        int y = 0;

        assertEquals(2,Algoritimo26.modSimples(x,y));
    }
}