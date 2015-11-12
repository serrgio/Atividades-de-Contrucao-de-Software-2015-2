package br.ufg.inf.es.construcao.software.algoritmo21;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo21Test {

    @Test
    public void testQuadradoPerfeito() throws Exception {
        int k = 64;
        assertEquals(true,Algoritimo21.quadradoPerfeito(k));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuadradoPerfeitoValorInvalido() throws Exception {
        int k = 0;
        assertEquals(true,Algoritimo21.quadradoPerfeito(k));
    }
}