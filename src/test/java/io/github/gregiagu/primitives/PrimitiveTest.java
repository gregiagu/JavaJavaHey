package io.github.gregiagu.primitives;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

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
    void someNumericIntegerRanges() {
        byte byteNum = Byte.MAX_VALUE + Byte.MIN_VALUE +1;
        short shortNum = Short.MAX_VALUE + Short.MIN_VALUE + 1;
        int intNum = Integer.MAX_VALUE + Integer.MIN_VALUE + 1;
        long longNum = Long.MAX_VALUE + Long.MIN_VALUE + 1;
        assertThat(byteNum).isEqualTo((byte) 0);
        assertThat(shortNum).isEqualTo((short) 0);
        assertThat(intNum).isEqualTo(0);
        assertThat(longNum).isEqualTo(0);
    }
    @Test
    void someNumericFloatingPointPrecision() {
        float floatNum = Float.MAX_VALUE + Float.MIN_VALUE;
        double doubleNum = Double.MAX_VALUE + Double.MIN_VALUE;
        assertThat(floatNum).isEqualTo(3.4028235E38f);
        assertThat(doubleNum).isEqualTo(1.7976931348623157E308);
    }

    @Test
    void someBinaryConvert() {
        int binary = 0b00111010;
        int decimal = 58;
        assertThat(binary).isEqualTo(decimal);
    }

    @Test
    void numberFormatting() {
        int kiloNumber = 89_000;
        int megaNumber = 123_050_238;
        NumberFormat cni = NumberFormat.getCompactNumberInstance(
                Locale.ENGLISH,
                NumberFormat.Style.SHORT
        );
        String formattedKilo = cni.format(kiloNumber);
        String formattedMega = cni.format(megaNumber);
        assertThat(formattedKilo).isEqualTo("89K");
        assertThat(formattedMega).isEqualTo("123M");
    }
}
