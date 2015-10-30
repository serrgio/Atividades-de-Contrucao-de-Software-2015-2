package br.ufg.inf.es.construcao.software.algoritmo8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste do Algorítmo 8
 */
public class Algoritmo8Test {
    
    /**
    * Teste envio de argumento válido para o método Propriedade153, da classe Algoritmo8.
    */
    @Test
    public void testPropriedade153() {
        int n = 1;
        Algoritmo8 instance = new Algoritmo8();
        boolean expResult = true;
        boolean result = instance.Propriedade153(n);
        assertEquals(expResult, result);
    }
    
    /**
    * Teste envio de argumento inválido para o método Propriedade153, da classe Algoritmo8.
    */
    @Test(expected=IllegalArgumentException.class)
    public void testArgumentoInvalido() {
       Algoritmo8 instance = new Algoritmo8();
       instance.Propriedade153(-1);
    }
    
}
