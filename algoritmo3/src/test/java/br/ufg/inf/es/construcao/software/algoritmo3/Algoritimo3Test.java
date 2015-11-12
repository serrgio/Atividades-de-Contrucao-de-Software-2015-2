package br.ufg.inf.es.construcao.software.algoritmo3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo3Test {

    @Test
    public void testSomaNaturais() throws Exception {
        int n = 4;
        assertEquals(10,Algoritimo3.somaNaturais(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSomaNaturaisNegativo()
    {
        int n = -4;
        assertEquals(10,Algoritimo3.somaNaturais(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSomaNaturaisZero()
    {
        int n = 0;
        assertEquals(10,Algoritimo3.somaNaturais(n));
    }
}