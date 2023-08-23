package io.github.gregiagu.unit;

import io.github.gregiagu.oop.EnclosingClass;
import io.github.gregiagu.oop.SimplePlainEasy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectOrientedProgrammingTest {

    @Test
    void aSimplePlainEasyObjectCopy() {
        SimplePlainEasy original = new SimplePlainEasy();
        original.setSimple(false);
        original.setPlain(true);
        original.setEasy(true);
        SimplePlainEasy copy = new SimplePlainEasy(original);
        assertThat(copy.hashCode()).isNotEqualTo(original.hashCode());
        assertThat(copy.isEasy()).isEqualTo(original.isEasy());
        assertThat(copy.isPlain()).isEqualTo(original.isPlain());
        assertThat(copy.isSimple()).isEqualTo(original.isSimple());
    }
    @Test
    void itShouldGetAStaticNestedClass() {
        EnclosingClass.StaticNestedClass staticNestedClass = new EnclosingClass.StaticNestedClass();
        assertThat(staticNestedClass.run())
                .isNotNull()
                .isInstanceOf(String.class)
                ;
    }
    @Test
    void itShouldGetAInnerClass() {
        EnclosingClass enclosingClass = new EnclosingClass();
        EnclosingClass.InnerClass innerClass = enclosingClass.new InnerClass();
        assertThat(innerClass.isRunning())
                .isInstanceOf(Boolean.class)
                .isTrue();
    }
}
