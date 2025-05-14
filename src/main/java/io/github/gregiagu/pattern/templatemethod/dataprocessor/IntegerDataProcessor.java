package io.github.gregiagu.pattern.templatemethod.dataprocessor;

import com.google.common.base.Preconditions;

public class IntegerDataProcessor 
implements DataProcessor<Integer> {

    @Override
    public Integer preprocess(Integer data) {
        Preconditions.checkNotNull(data);
        return data;
    }

    @Override
    public Integer doprocess(Integer data) {
        return (data + 2)*10;
    }

    @Override
    public Integer postprocess(Integer data) {
        Preconditions.checkArgument(data > 0);
        return data;
    }

    @Override
    public String displayData(Integer data) {
        return String.valueOf(data);
    }

}
