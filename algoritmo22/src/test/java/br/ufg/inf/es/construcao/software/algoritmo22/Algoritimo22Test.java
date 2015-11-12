package br.ufg.inf.es.construcao.software.algoritmo22;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo22Test {

    @Test
    public void testAmigos() throws Exception {
        int n = 10;
        int m = 8;
        assertEquals(false,Algoritimo22.amigos(n,m));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAmigosInvalido() throws Exception {
        int n = 0;
        int m = 0;
        assertEquals(false,Algoritimo22.amigos(n,m));
    }


}