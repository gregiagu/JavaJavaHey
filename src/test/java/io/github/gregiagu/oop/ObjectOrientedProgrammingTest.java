package io.github.gregiagu.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ObjectOrientedProgrammingTest {
    @Test
    void createDifferentInstancesOfAClass() {
        SimplePlainEasy firstInstance = new SimplePlainEasy();
        SimplePlainEasy secondInstance = new SimplePlainEasy();
        assertThat(firstInstance)
                .isNotNull()
                .isInstanceOf(SimplePlainEasy.class)
                ;
        assertThat(secondInstance)
                .isNotNull()
                .isInstanceOf(SimplePlainEasy.class)
                ;
        assertThat(firstInstance)
                .isNotEqualTo(secondInstance)
                ;
    }
}
