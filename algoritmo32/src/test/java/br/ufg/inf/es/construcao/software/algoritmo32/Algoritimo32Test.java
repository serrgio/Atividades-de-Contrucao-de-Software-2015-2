package br.ufg.inf.es.construcao.software.algoritmo32;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo32Test {

    @Test
    public void testFibonacci() throws Exception {
        int n = 5;
        assertEquals(5,Algoritimo32.fibonacci(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciInvalido() throws Exception {
        int n = -2;
        assertEquals(5,Algoritimo32.fibonacci(n));
    }
}