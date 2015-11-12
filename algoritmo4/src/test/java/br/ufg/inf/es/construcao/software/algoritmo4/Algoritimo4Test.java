package br.ufg.inf.es.construcao.software.algoritmo4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo4Test {

    @Test
    public void testProduto() throws Exception {
        int a = 3;
        int b = 4;
        assertEquals(12, Algoritimo4.produto(a,b));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProdutoComAMenorQueZero() throws Exception {
        int a = -3;
        int b = 4;
        assertEquals(-12, Algoritimo4.produto(a,b));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProdutoComBMenorQueZero() throws Exception {
        int a = 3;
        int b = -4;
        assertEquals(-12, Algoritimo4.produto(a,b));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProdutoComAeBMenorQueZero() throws Exception {
        int a = -3;
        int b = -4;
        assertEquals(12, Algoritimo4.produto(a,b));
    }
}