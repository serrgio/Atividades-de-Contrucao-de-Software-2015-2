package br.ufg.inf.es.construcao.software.algoritmo1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo1Test {

    @Test
    public void testDiaDaSemana() throws Exception {
        int diaDaSemana = Algoritimo1.DiaDaSemana(11,11,2015);
        assertEquals(2,diaDaSemana);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiaDaSemanaDiaErrado()
    {
        int diaDaSemana = Algoritimo1.DiaDaSemana(50,11,2015);
        assertEquals(4,diaDaSemana);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiaDaSemanaMesErrado()
    {
        int diaDaSemana = Algoritimo1.DiaDaSemana(11,20,2015);
        assertEquals(4,diaDaSemana);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiaDaSemanaAnoErrado()
    {
        int diaDaSemana = Algoritimo1.DiaDaSemana(11,11,1000);
        assertEquals(4,diaDaSemana);
    }

}