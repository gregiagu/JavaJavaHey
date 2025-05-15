package io.github.gregiagu.pattern.strategy.taxstrategy;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class TaxStrategyTest {

    @Test
    void calculateIcmsTest() {
        BigDecimal target = BigDecimal.valueOf(4);
        BigDecimal amount = BigDecimal.valueOf(100);
        TaxType tax = new IcmsTax();
        TaxCalclator calc = new TaxCalclator(tax);
        BigDecimal taxValue = calc.calculate(amount);
        assertThat(taxValue).isEqualTo(target);
    }

    @Test
    void calculateIssTest() {
        BigDecimal target = BigDecimal.valueOf(11);
        BigDecimal amount = BigDecimal.valueOf(100);
        TaxType tax = new IssTax();
        TaxCalclator calc = new TaxCalclator(tax);
        BigDecimal taxValue = calc.calculate(amount);
        assertThat(taxValue).isEqualTo(target);
    }
    
    @Test
    void calculateIpiTest() {
        BigDecimal target = BigDecimal.valueOf(15);
        BigDecimal amount = BigDecimal.valueOf(100);
        TaxType tax = new IpiTax();
        TaxCalclator calc = new TaxCalclator(tax);
        BigDecimal taxValue = calc.calculate(amount);
        assertThat(taxValue).isEqualTo(target);
    }
}
