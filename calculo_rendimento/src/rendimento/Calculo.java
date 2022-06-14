package rendimento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculo {

	private final BigDecimal divisor = new BigDecimal(100);
	
// (valor * taxa)/100
	public BigDecimal calculaCDIMensal(BigDecimal valor, BigDecimal taxa) {
	BigDecimal valorMensal = (valor.multiply(taxa)).divide(divisor);
		return valorMensal.setScale(2,RoundingMode.HALF_EVEN);
	}
}
