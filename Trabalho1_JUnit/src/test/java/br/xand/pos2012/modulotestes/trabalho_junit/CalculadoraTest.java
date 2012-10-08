/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.xand.pos2012.modulotestes.trabalho_junit;

import java.math.BigDecimal;
import junit.framework.TestCase;

/**
 *
 * @author Magri
 */
public class CalculadoraTest extends TestCase {
    
    public CalculadoraTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSomaNull() {
        System.out.println("Soma Null");
        Calculadora calculadora = new Calculadora();
        
        calculadora.soma();

        assertEquals(calculadora.getResultado(), new BigDecimal(0));

    }
    
    public void testSomaTamanho1() {
        System.out.println("Soma numeros de tamanho 1");
        Calculadora calculadora = new Calculadora();

        calculadora.setValor1(new BigDecimal(2));
        calculadora.setValor2(new BigDecimal(3));
        calculadora.soma();
        assertEquals(calculadora.getResultado(), new BigDecimal(5));
    }
    
    public void testSubtrairNull() {
        System.out.println("Subtrair Null");
        Calculadora calculadora = new Calculadora();
        
        calculadora.subtrair();

        assertEquals(calculadora.getResultado(), new BigDecimal(0));

    }
    
    public void testSubtrairTamanho1() {
        System.out.println("Subtrair numeros de tamanho 1");
        Calculadora calculadora = new Calculadora();

        calculadora.setValor1(new BigDecimal(9));
        calculadora.setValor2(new BigDecimal(4));
        calculadora.subtrair();
        assertEquals(calculadora.getResultado(), new BigDecimal(5));
    }
    
    public void testMultiplicarNull() {
        System.out.println("Multiplicar Null");
        Calculadora calculadora = new Calculadora();
        
        calculadora.multiplicar();

        assertEquals(calculadora.getResultado(), new BigDecimal(0));

    }
    
    public void testMultiplicarTamanho1() {
        System.out.println("Multiplicar numeros de tamanho 1");
        Calculadora calculadora = new Calculadora();

        calculadora.setValor1(new BigDecimal(2));
        calculadora.setValor2(new BigDecimal(4));
        calculadora.multiplicar();
        assertEquals(calculadora.getResultado(), new BigDecimal(8));
    }
    
    public void testDividirNull() {
        System.out.println("Dividir Null");
        Calculadora calculadora = new Calculadora();
        
        calculadora.dividir();

        assertEquals(calculadora.getResultado(), new BigDecimal(0));

    }
    
    public void testDividirPorZero() {
        System.out.println("Dividir numeros de tamanho 1");
        Calculadora calculadora = new Calculadora();

        calculadora.setValor1(new BigDecimal(8));
        calculadora.setValor2(new BigDecimal(0));
        
        try {
           calculadora.dividir();
           assertEquals(calculadora.getResultado(), new BigDecimal(0));
        } catch (Exception e) {
           assertTrue(e.getMessage(), false);
        }
        
        
        
    }
    
    public void testDividirTamanho1() {
        System.out.println("Dividir numeros de tamanho 1");
        Calculadora calculadora = new Calculadora();

        calculadora.setValor1(new BigDecimal(8));
        calculadora.setValor2(new BigDecimal(2));
        calculadora.dividir();
        assertEquals(calculadora.getResultado(), new BigDecimal(4));
    }
}
