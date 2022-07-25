package pro.sky.skyprospringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestingConstantsTestParam {

    public static final int NUMBER_ONE = 10;
    public static final int NUMBER_TWO = 2;
    public static final int ZERO = 0;
    public static final int PLUS_RESULT = 12;
    public static final int MINUS_RESULT = 8;
    public static final int MULTIPLY_RESULT = 20;
    public static final int DIVIDE_RESULT = 5;

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(NUMBER_ONE, NUMBER_TWO)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldGenerateCorrectNumbersPlus(int a, int b) {
        int result = out.plus(a, b);
        Assertions.assertTrue(result == PLUS_RESULT);
        Assertions.assertEquals(PLUS_RESULT, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldGenerateCorrectNumbersMinus(int a, int b) {
        int result = out.minus(a, b);
        Assertions.assertTrue(result == MINUS_RESULT);
        Assertions.assertEquals(MINUS_RESULT, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldGenerateCorrectNumbersMultiply(int a, int b) {
        int result = out.multiply(a, b);
        Assertions.assertTrue(result == MULTIPLY_RESULT);
        Assertions.assertEquals(MULTIPLY_RESULT, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldGenerateCorrectNumbersDivide(int a, int b) {
        int result = out.divide(a, b);
        Assertions.assertTrue(result == DIVIDE_RESULT);
        Assertions.assertEquals(DIVIDE_RESULT, result);
    }
}