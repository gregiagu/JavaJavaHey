package io.github.gregiagu.pattern.templatemethod.dataprocessor;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DataprocessorTest {

    @Test
    void createCpfValid() {
        Cpf cpf = new Cpf("22233344499");
        assertThat(cpf.getCleanCpfNumber()).isNotBlank().isEqualTo("22233344499");
        assertThat(cpf.getDottedCpfNumber()).isNotBlank().isEqualTo("222.333.444-99");
    }

    @Test
    void receiveCorretDataStringTest() {
        DataProcessor<Integer> idp = new IntegerDataProcessor();
        assertThat(idp.process(2)).isNotEmpty().isEqualTo("40");
    }

    @Test
    void receiveCorrectCpfStringTest() {
        Cpf cpf = new Cpf("22233344499");
        DataProcessor<Cpf> cpfdp = new CpfDataProcessor();
        assertThat(cpfdp.process(cpf)).isNotEmpty().isEqualTo("222.333.444-99");
    }
}
