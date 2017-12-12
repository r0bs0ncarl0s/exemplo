package exemplo;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import br.com.casnav.robson.Calculadora;

public class CalculadoraTest {
	
	public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(CalculadoraTest.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	  }

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.somar(new BigDecimal(2), new BigDecimal(3)), new BigDecimal(5));
	}

	@Test
	public void testSubtrair() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.subtrair(new BigDecimal(3), new BigDecimal(2)), new BigDecimal(1));
	}

	@Test
	public void testMultiplicar() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.multiplicar(new BigDecimal(2), new BigDecimal(3)), new BigDecimal(6));
	}

	@Test
	public void testDividir() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.dividir(new BigDecimal(10), new BigDecimal(2)), new BigDecimal(5));
	}

}
