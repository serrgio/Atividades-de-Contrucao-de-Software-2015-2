package br.ufg.inf.es.construcao.software.algoritmo20;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo20Test {

    @Test
    public void testRazaoAurea() throws Exception {
        int t1 = 1;
        int t2 = 2;
        int fator = 1;
        assertEquals(3,Algoritimo20.razaoAurea(t1,t2,fator),2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRazaoAureaInvalido() throws Exception {
        int t1 = 1;
        int t2 = 0;
        int fator = 1;
        assertEquals(3,Algoritimo20.razaoAurea(t1,t2,fator),2);
    }
}