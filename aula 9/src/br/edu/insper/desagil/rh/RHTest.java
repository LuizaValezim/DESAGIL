package br.edu.insper.desagil.rh;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RHTest {
    private static double DELTA = 0.000001;

    private RH rh;

    @BeforeEach
    public void setUp() {
        rh = new RH();
    }

    @Test
    public void folhaVazia() {
        assertEquals(0, rh.calculaMedia(), DELTA);
    }

    @Test
    public void tresFuncionarios() {
        rh.contrata(new Funcionario(0, "Maria", 10.00));
        rh.contrata(new Funcionario(0, "João", 25.25));
        rh.contrata(new Funcionario(0, "Mariana", 50.50));
        assertEquals(28.58333333, rh.calculaMedia(), DELTA);
    }

    @Test
    public void tresGerentes() {
        rh.contrata(new Gerente(0, "Maria", 10.00));
        rh.contrata(new Gerente(0, "João", 25.25));
        rh.contrata(new Gerente(0, "Mariana", 50.50));
        assertEquals(28.58333333, rh.calculaMedia(), DELTA);
    }

    @Test
    public void tresDiretores() {
        rh.contrata(new DiretorDeMarketing(0, "Maria", 10.00));
        rh.contrata(new DiretorDeVendas(0, "João", 25.25));
        DiretorDeVendas diretor = new DiretorDeVendas(0, "Mariana", 50.50);
        diretor.incrementaFaturamento(75.00);
        rh.contrata(diretor);
        assertEquals(59.666666, rh.calculaMedia(), DELTA);
    }

    @Test
    public void quatroDiferentes() {
        rh.contrata(new Funcionario(0, "Maria", 10.00));
        rh.contrata(new Gerente(0, "João", 25.25));
        rh.contrata(new DiretorDeMarketing(0, "Mariana", 50.50));
        rh.contrata(new DiretorDeVendas(0, "José", 75.00));
        assertEquals(71.5625, rh.calculaMedia(), DELTA);
    }
}