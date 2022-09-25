package com.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    @Test
    void testSumArrayHappyPath() {
        // give
        double[] array = new double[]{2, 2, 4, 10, 2};
        double expectedResult = 20;
        Calculator calculator = new Calculator();

        // when
        double actualResult = calculator.sumArray(array);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> paramsSuppler() {
        return Stream.of(
                Arguments.of(new double[]{2, 2, 4, 10, 2}, 20),
                Arguments.of(new double[]{2, 2, 4, 20, 2}, 30),
                Arguments.of(new double[]{2, 30, 4, 4, 2}, 42)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsSuppler")
    void testSumArrayHappyPath2(double[] array, double expectedResult) {
        // give
        Calculator calculator = new Calculator();

        // when
        double actualResult = calculator.sumArray(array);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSumHappyPath() {
        // give
        double a = 2.0;
        double b = 2.0;
        double expectedResult = 4.0;
        Calculator calculator = new Calculator();

        // when
        double actualResult = calculator.sum(a, b);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

//    @Test
//    void testDivisionEdgeCaseDivisionByZero() {
//        // give
//        int a = 2;
//        int b = 0;
//        Calculator calculator = new Calculator();
//        String expectedMessage = "Division by zero is not allowed.";
//
//        // when/then
//        var exception = Assertions.assertThrows(
//                RuntimeException.class, () -> calculator.division(a, b));
//
//        String actualMessage = exception.getMessage();
//        Assertions.assertEquals(expectedMessage, actualMessage);
//    }

    @Test
    void testDivision2EdgeCaseDivisionByZero() {
        // give
        int a = 2;
        int b = 0;
        int expectedResult = 0;
        Calculator calculator = new Calculator();

        // when
        int actualResult = calculator.division2(a, b);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
