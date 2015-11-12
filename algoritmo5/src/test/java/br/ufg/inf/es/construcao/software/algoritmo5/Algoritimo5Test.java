package br.ufg.inf.es.construcao.software.algoritmo5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo5Test {

    @Test
    public void testPotencia() throws Exception {
        int x = 2;
        int y = 3;
        assertEquals(8,Algoritimo5.potencia(x,y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaComXMenorQue1(){
        int x = 0;
        int y = 3;
        assertEquals(1,Algoritimo5.potencia(x,y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaComYMenorQue1(){
        int x = 2;
        int y = 0;
        assertEquals(1,Algoritimo5.potencia(x,y));
    }


}