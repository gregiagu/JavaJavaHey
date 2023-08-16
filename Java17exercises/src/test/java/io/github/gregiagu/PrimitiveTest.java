package io.github.gregiagu;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PrimitiveTest {
    @Test
    void itShouldAssertTrue() {
        boolean res = true;
        assertThat(res).isTrue();
    }
    @Test
    void itShouldGetCharacters() {
        char init = 'b';
        char number = 92;
        char character = 'u';
        char escape = '\u0068';
        assertThat(number).isEqualTo('\\');
        assertThat(character).isEqualTo('u');
        assertThat(escape).isEqualTo('h');
        assertThat((char)(init + 0)).isEqualTo('b');
        assertThat((char)(init + 1)).isEqualTo('c');
        assertThat((char)(init + 2)).isEqualTo('d');
    }
    @Test
    void itShouldAssertEqualObjects() {
        var first = new Object();
        assertThat(first).isNotNull().isInstanceOf(Object.class);
    }
    @Test
    void someNumericRanges() {
        byte byteNum = Byte.MAX_VALUE + Byte.MIN_VALUE +1;
        short shortNum = Short.MAX_VALUE + Short.MIN_VALUE + 1;
        int intNum = Integer.MAX_VALUE + Integer.MIN_VALUE + 1;
        long longNum = Long.MAX_VALUE + Long.MIN_VALUE + 1;
        assertThat(byteNum).isEqualTo((byte) 0);
        assertThat(shortNum).isEqualTo((short) 0);
        assertThat(intNum).isEqualTo(0);
        assertThat(longNum).isEqualTo(0);
    }
}
