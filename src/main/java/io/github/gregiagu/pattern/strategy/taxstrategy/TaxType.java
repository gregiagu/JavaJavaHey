package io.github.gregiagu.pattern.strategy.taxstrategy;

import java.math.BigDecimal;

public interface TaxType {

    BigDecimal calculate(BigDecimal amount);
}
