package br.ufg.inf.es.construcao.software.algoritmo6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 12/11/2015.
 */
public class Algoritimo6Test {

    @Test
    public void testPotenciaSoma() throws Exception {
        int x = 2;
        int y = 3;
        assertEquals(8,Algoritimo6.potenciaSoma(x,y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaSomaComXMenorQue1(){
        int x = 0;
        int y = 3;
        assertEquals(1,Algoritimo6.potenciaSoma(x,y));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaSomaComYMenorQue0(){
        int x = 2;
        int y = -1;
        assertEquals(1,Algoritimo6.potenciaSoma(x,y));
    }
}