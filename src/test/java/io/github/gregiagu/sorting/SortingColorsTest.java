package io.github.gregiagu.sorting;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;
public class SortingColorsTest {

    Colors[] colors = {
            Colors.BLACK,
            Colors.BLUE,
            Colors.BLACK,
            Colors.BLUE,
            Colors.GREEN,
            Colors.BLUE,
            Colors.RED,
            Colors.RED,
            Colors.RED,
            Colors.WHITE,
            Colors.BLUE,
            Colors.WHITE,
            Colors.YELLOW
    };

    ArrayList<Colors> colorsList = new ArrayList<>(Arrays.asList(colors));

    @Test
    void sortColors() {
        SortingColors sortingColors = new SortingColors();
        Map<String, Long> stringLongMap = sortingColors.mapDistincColors(colorsList);
        Long reduced = sortingColors.reduceColorMaps(stringLongMap);
        assertThat(reduced)
                .isNotNull()
                .isEqualTo(5)
                ;
    }

}
