package br.ufg.inf.es.construcao.software.algoritmo15;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vinicius on 12/11/2015.
 */
public class Algoritimo15Test {

    @Test
    public void testPi() throws Exception {
        int n = 2;
        assertEquals(3.14, Algoritimo15.pi(n),2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPiNZero() throws Exception {
        int n = 0;
        assertEquals(3.14, Algoritimo15.pi(n),2);
    }
}