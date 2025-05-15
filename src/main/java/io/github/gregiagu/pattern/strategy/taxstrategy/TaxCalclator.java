package io.github.gregiagu.pattern.strategy.taxstrategy;

import java.math.BigDecimal;

public class TaxCalclator {

    private TaxType taxType;

    public TaxCalclator(TaxType taxType) {
        this.taxType = taxType;
    }

    public BigDecimal calculate(BigDecimal amount) {
        return taxType.calculate(amount);
    }

}
