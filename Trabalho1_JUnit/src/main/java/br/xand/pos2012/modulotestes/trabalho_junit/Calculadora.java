/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.xand.pos2012.modulotestes.trabalho_junit;

import java.math.BigDecimal;

/**
 *
 * @author Magri
 */
public class Calculadora {

    private BigDecimal resultado;
    private BigDecimal valor1;
    private BigDecimal valor2;

    public Calculadora() {
        resultado = new BigDecimal(0);
    }

    public void soma() {
        if (valor1 != null && valor2 != null) {
            resultado = valor1.add(valor2);
        } else {
            resultado = new BigDecimal(0);
        }
    }

    public void subtrair() {
        if (valor1 != null && valor2 != null) {
            resultado = valor1.subtract(valor2);
        } else {
            resultado = new BigDecimal(0);
        }
    }

    public void multiplicar() {
        if (valor1 != null && valor2 != null) {
            resultado = valor1.multiply(valor2);
        } else {
            resultado = new BigDecimal(0);
        }
    }

    public void dividir() {
        if (valor1 != null && valor2 != null && (valor2.compareTo(new BigDecimal(0)) != 0)) {
            resultado = valor1.divide(valor2);
        } else {
            resultado = new BigDecimal(0);
        }
    }

    /**
     * @return the resultado
     */
    public BigDecimal getResultado() {
        return resultado;
    }

    /**
     * @return the valor1
     */
    public BigDecimal getValor1() {
        return valor1;
    }

    /**
     * @param valor1 the valor1 to set
     */
    public void setValor1(BigDecimal valor1) {
        this.valor1 = valor1;
    }

    /**
     * @return the valor2
     */
    public BigDecimal getValor2() {
        return valor2;
    }

    /**
     * @param valor2 the valor2 to set
     */
    public void setValor2(BigDecimal valor2) {
        this.valor2 = valor2;
    }
}
