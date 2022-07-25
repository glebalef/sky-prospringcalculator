package pro.sky.skyprospringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SkyProSpringCalculatorApplicationTests {
	public static final int NUMBER_ONE = 10;
	public static final int NUMBER_TWO = 2;
	public static final int ZERO = 0;
	public static final int PLUS_RESULT = 12;
	public static final int MINUS_RESULT = 8;
	public static final int MULTIPLY_RESULT = 20;
	public static final int DIVIDE_RESULT = 5;

	private final CalculatorServiceImpl out = new CalculatorServiceImpl();

	@Test
	public void shouldBeTwelve() {
		int result = out.plus(NUMBER_ONE, NUMBER_TWO);
		Assertions.assertTrue(result == PLUS_RESULT);
		Assertions.assertEquals(PLUS_RESULT, result);
	}
	@Test
	public void shouldBeEight() {
		int result = out.minus(NUMBER_ONE, NUMBER_TWO);
		Assertions.assertTrue(result == MINUS_RESULT);
		Assertions.assertEquals(MINUS_RESULT, result);
	}
	@Test
	public void shouldBeTwenty() {
		int result = out.multiply(NUMBER_ONE, NUMBER_TWO);
		Assertions.assertTrue(result == MULTIPLY_RESULT);
		Assertions.assertEquals(MULTIPLY_RESULT, result);
	}
	@Test
	public void shouldBeFive() {
		int result = out.divide(NUMBER_ONE, NUMBER_TWO);
		Assertions.assertTrue(result == DIVIDE_RESULT);
		Assertions.assertEquals(DIVIDE_RESULT, result);
	}
	@Test
	public void shouldThrowDevideByZeroExeption() {
		Assertions.assertThrows(DevideByZeroExeption.class,
				() -> out.divide(NUMBER_ONE, ZERO)
		);
	}
}



