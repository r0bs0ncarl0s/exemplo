package br.com.casnav;

import java.io.Serializable;
import java.math.BigDecimal;

public class Calculadora implements Serializable {
	
	public BigDecimal somar(BigDecimal val1, BigDecimal val2) {
		if((val1!=null) && (val2!=null)) {
			return val1.add(val2);
		}
		return null;
	}
	public BigDecimal subtrair(BigDecimal val1, BigDecimal val2) {
		if((val1!=null) && (val2!=null)) {
			return val1.subtract(val2);
		}
		return null;
	}
	public BigDecimal multiplicar(BigDecimal val1, BigDecimal val2) {
		if((val1!=null) && (val2!=null)) {
			return val1.multiply(val2);
		}
		return null;
	}
	public BigDecimal dividir(BigDecimal val1, BigDecimal val2) {
		if((val1!=null) && (val2!=null)) {
			return val1.divide(val2);
		}
		return null;
	}

}
