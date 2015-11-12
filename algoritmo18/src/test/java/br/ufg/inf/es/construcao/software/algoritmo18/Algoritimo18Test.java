package br.ufg.inf.es.construcao.software.algoritmo18;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo18Test {

    @Test
    public void testLofNaturalSimples() throws Exception {
        int n = 3;
        int k = 2;
        assertEquals(13,Algoritimo18.lofNaturalSimples(n,k),13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLofNaturalSimplesComNMenor1() throws Exception {
        int n = 0;
        int k = 2;
        assertEquals(13,Algoritimo18.lofNaturalSimples(n,k),13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLofNaturalSimplesComKMenor2() throws Exception {
        int n = 3;
        int k = 1;
        assertEquals(13,Algoritimo18.lofNaturalSimples(n,k),13);
    }


}