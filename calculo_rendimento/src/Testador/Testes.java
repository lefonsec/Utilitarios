package Testador;

import java.math.BigDecimal;

import rendimento.Calculo;

public class Testes {

	public static void main(String[] args) {

		Calculo calc = new Calculo();
		System.out.println(calc.calculaCDIMensal(new BigDecimal("1000000.00"),new BigDecimal("1.05")));
		
	}

}
