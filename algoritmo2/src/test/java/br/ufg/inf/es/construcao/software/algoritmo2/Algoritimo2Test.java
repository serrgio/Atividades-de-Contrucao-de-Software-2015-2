package br.ufg.inf.es.construcao.software.algoritmo2;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo2Test {

    @org.junit.Test
    public void testVerificaParidadeComNumeroPar() throws Exception {
        int n = 42;
        assertEquals(true, Algoritimo2.verificaParidade(n));
    }

    @org.junit.Test
    public void testVerificaParidadeComNumeroImPar() throws Exception {
        int n = 47;
        assertEquals(false,Algoritimo2.verificaParidade(n));
    }
}