package CalculadoraTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import calculadora.Calculadora;

public class CalculadoraTest {
    @Test
    public void VerificaPositivo(){
        Calculadora calc = new Calculadora();
        boolean status = calc.ehPositivo(30);
        assertTrue(status);
    }
    @Test
    public void DivisaoPorUm() {
	Calculadora calc = new Calculadora();
        int div = calc.divisao(35, 1);
        assertEquals(35,div);		
    } 
    @Test
    public void SomaNumerosNegativos() {
	Calculadora calc = new Calculadora();
        int soma = calc.soma(-10, 10);
        assertEquals(0,soma);		
    }
    @Test
    public void SubtracaoComZero(){
        Calculadora calc = new Calculadora();
        int sub = calc.subtracao(10, 0);
        assertEquals(10,sub);
    }
    @Test
    public void MultiplicacaoNumerosNegativos() {
	Calculadora calc = new Calculadora();
        int multi = calc.multiplicacao(-20, 10);
        assertEquals(-200,multi);		
    }
}