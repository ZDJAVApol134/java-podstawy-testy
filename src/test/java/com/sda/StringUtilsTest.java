package com.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringUtilsTest {

    @Test
    void testCapitalizeSuccess() {
        // given
        String name = "FILIP";
        String expectedName = "Filip";

        // when
        String actualName = StringUtils.capitalize(name);

        // then
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    @SuppressWarnings("all")
    void testCapitalizeNullParam() {
        // given
        String name = null;

        // when
        String actualName = StringUtils.capitalize(name);

        // then
        Assertions.assertNull(actualName);
    }

//    @EmptySource(Enum.class)
//    @MethodSource("")
    @ParameterizedTest
    @ValueSource(strings = {"       ", " "})
    void testCapitalizeBlank(String expectedName) {
        // when
        String actualName = StringUtils.capitalize(expectedName);

        // then
        Assertions.assertEquals(expectedName, actualName);
    }


    @Test
    void testCapitalizeEmpty() {
        // given
        String expectedName = "";

        // when
        String actualName = StringUtils.capitalize(expectedName);

        // then
        Assertions.assertNotNull(expectedName);
        Assertions.assertEquals(expectedName, actualName);
    }
}