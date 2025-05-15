package io.github.gregiagu.pattern.strategy.taxstrategy;

import java.math.BigDecimal;

public class IcmsTax 
implements TaxType {

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        BigDecimal factor = BigDecimal.valueOf(4);
        BigDecimal denominator = BigDecimal.valueOf(100);
        return amount.multiply(factor).divide(denominator);
    }

}
