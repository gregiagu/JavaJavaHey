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

    @Test
    void getTypeFromInterface() {
        class TypeCl implements TypeInterface {}

        TypeCl typeCl = new TypeCl();
        TypeInterface interfaced = new TypeCl();

        assertThat(typeCl)
                .isNotNull()
                .isInstanceOf(TypeCl.class)
                .isInstanceOf(TypeInterface.class)
        ;

        assertThat(interfaced)
                .isNotNull()
                .isInstanceOf(TypeCl.class)
                .isInstanceOf(TypeInterface.class)
        ;
    }

    @Test
    void getTypeFromAbstractClass() {
        AbstractedClass concreteClass = new ConcreteClass();
        assertThat(concreteClass)
                .isNotNull()
                .isInstanceOf(AbstractedClass.class)
                .isInstanceOf(ConcreteClass.class)
                ;
    }
}
