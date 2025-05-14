package io.github.gregiagu.pattern.templatemethod.dataprocessor;

public interface DataProcessor<T> {
    
    default String process(T data) {
        T preprocessed = preprocess(data);
        T processedData = doprocess(preprocessed);
        T postprocessed = postprocess(processedData);
        return displayData(postprocessed);
    }

    T preprocess(T data);
    T doprocess(T data);
    T postprocess(T data);

    String displayData(T data);
}
