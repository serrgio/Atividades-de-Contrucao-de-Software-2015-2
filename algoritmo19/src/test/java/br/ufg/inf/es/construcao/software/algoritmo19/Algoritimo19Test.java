package br.ufg.inf.es.construcao.software.algoritmo19;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo19Test {

    @Test
    public void testLogN() throws Exception {
        int n = 3;
        int k = 2;
        assertEquals(13,Algoritimo19.logN(n,k),13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLogNComNMenor1() throws Exception {
        int n = 0;
        int k = 2;
        assertEquals(13,Algoritimo19.logN(n,k),13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLogNComKMenor2() throws Exception {
        int n = 3;
        int k = 1;
        assertEquals(13,Algoritimo19.logN(n,k),13);
    }

}