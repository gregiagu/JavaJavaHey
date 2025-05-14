package io.github.gregiagu.pattern.templatemethod.dataprocessor;

import com.google.common.base.Preconditions;

public class CpfDataProcessor
implements DataProcessor<Cpf> {

    @Override
    public Cpf preprocess(Cpf data) {
        Preconditions.checkArgument(data.isValid());
        return data;
    }

    @Override
    public Cpf doprocess(Cpf data) {
        Preconditions.checkNotNull(data);
        return data;
    }

    @Override
    public Cpf postprocess(Cpf data) {
        Preconditions.checkNotNull(data);
        return data;
    }

    @Override
    public String displayData(Cpf data) {
        Preconditions.checkNotNull(data);
        return data.getDottedCpfNumber();
    }

}
