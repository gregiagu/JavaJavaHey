package io.github.gregiagu.sorting;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingColors {

    public Map<String, Long> mapDistincColors(List<Colors> colorsList) {
        return colorsList.stream()
                .collect(
                        Collectors.groupingBy(
                                Colors::name,
                                Collectors.counting()
                        )
                );
    }

    public Long reduceColorMaps(Map<String, Long> colorsHash) {
        return colorsHash.values()
                .stream()
                .map(Long::doubleValue)
                .map(qtd -> qtd / 2.0)
                .map(Double::longValue)
                .reduce(
                        0L,
                        Long::sum
                );
    }
}
