package br.ufg.inf.es.construcao.software.algoritmo7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo7Test {

    @Test
    public void testPropriedade3025() throws Exception {
        int n = 3025;
        assertEquals(true,Algoritimo7.propriedade3025(n));
    }

    @Test
    public void testPropriedade3025CasoFalse() throws Exception {
        int n = 3026;
        assertEquals(false,Algoritimo7.propriedade3025(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropriedade3025ComNMenorQueZero() {
        int n = -3025;
        assertEquals(true,Algoritimo7.propriedade3025(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropriedade3025ComNMaiorQue9999() {
        int n = 999999;
        assertEquals(true,Algoritimo7.propriedade3025(n));
    }
}