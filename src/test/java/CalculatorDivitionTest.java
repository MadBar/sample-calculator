import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorDivitionTest {
	private static final Logger LOG = Logger
			.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	// @Test
	// public void testDivideSmallSizedPositiveNumbers() {
	// double firstNumber = 0;
	// double secondNumber = 0;
	// double result = 0;
	//
	// for (int i = 0; i < 200; i++) {
	// firstNumber = Double.valueOf(
	// df.format(random.nextDouble() * 10));
	// secondNumber = Double.valueOf(
	// df.format(random.nextDouble() * 10));
	// result = firstNumber + secondNumber;
	//
	// LOG.info("Testing the method add with: "
	// + firstNumber + " and " + secondNumber);
	// assertEquals(
	// Math.round(calculator.add(firstNumber,
	// secondNumber)),
	// Math.round(result), 1);
	//
	// }
	// }
	//
	// @Test
	// public void testDivideMediumSizedPositiveNumbers() {
	// double firstNumber = 0;
	// double secondNumber = 0;
	// double result = 0;
	//
	// for (int i = 0; i < 200; i++) {
	// firstNumber = Double.valueOf(
	// df.format(random.nextDouble() * 100));
	// secondNumber = Double.valueOf(
	// df.format(random.nextDouble() * 100));
	// result = firstNumber + secondNumber;
	//
	// LOG.info("Testing the method with: "
	// + firstNumber + " and " + secondNumber);
	// assertEquals(
	// Math.round(calculator.add(firstNumber,
	// secondNumber)),
	// Math.round(result), 1);
	//
	// }
	// }
	//
	// @Test
	// public void testDivideLargeSizedPositiveNumbers() {
	// double firstNumber = 0;
	// double secondNumber = 0;
	// double result = 0;
	//
	// for (int i = 0; i < 200; i++) {
	// firstNumber = Double.valueOf(
	// df.format(random.nextDouble() * 1000));
	// secondNumber = Double.valueOf(
	// df.format(random.nextDouble() * 1000));
	// result = firstNumber + secondNumber;
	//
	// LOG.info("Testing the method with: "
	// + firstNumber + " and " + secondNumber);
	// assertEquals(
	// Math.round(calculator.add(firstNumber,
	// secondNumber)),
	// Math.round(result), 1);
	//
	// }
	// }
	//
	@Test
	public void testDivideZeros() {
		// Testing the case 0/0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;

		LOG.info("Testing the method divide with: "
				+ firstNumber + " and " + secondNumber);
		assertEquals(
				Math.round(calculator.divide(firstNumber,
						secondNumber)),
				Math.round(result), 1);

		for (int i = 0; i < 200; i++) {

			// Testing the case of something random / zero
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			secondNumber = 0;
			result = -0.123456789;

			LOG.info("Testing the method divide with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.divide(
							firstNumber, secondNumber)),
					Math.round(result), 1);

			// Testing the case of zero / something random
			firstNumber = 0;
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.divide(
							firstNumber, secondNumber)),
					Math.round(result), 1);

		}
	}

}
