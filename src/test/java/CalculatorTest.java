import static org.junit.Assert.*;

// We can seperade these tests of each method (not each test) if we wish. Seperate test case files

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	private static final Logger LOG = Logger
			.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.add(firstNumber,
							secondNumber)),
					Math.round(result), 1);

		}
	}

	@Test
	public void testAddMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.add(firstNumber,
							secondNumber)),
					Math.round(result), 1);

		}
	}

	@Test
	public void testAddLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.add(firstNumber,
							secondNumber)),
					Math.round(result), 1);

		}
	}

	// --------

	@Test
	public void testAddSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * (-10)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.add(firstNumber,
							secondNumber)),
					Math.round(result), 1);

		}
	}

	@Test
	public void testAddMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df
					.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df
					.format(random.nextDouble() * (-100)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.add(firstNumber,
							secondNumber)),
					Math.round(result), 1);

		}
	}

	@Test
	public void testAddLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df
					.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df
					.format(random.nextDouble() * (-1000)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.add(firstNumber,
							secondNumber)),
					Math.round(result), 1);

		}
	}

	@Test
	public void testAddZeros() {

		// testing the case 0+0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method with: " + firstNumber
				+ " and " + secondNumber);
		assertEquals(
				Math.round(calculator.add(firstNumber,
						secondNumber)),
				Math.round(result), 1);

		for (int i = 0; i < 200; i++) {

			// Testing the case of zero + something random
			firstNumber = 0;
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.add(firstNumber,
							secondNumber)),
					Math.round(result), 1);

			// Testing the case of something random + zero
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			secondNumber = 0;
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.add(firstNumber,
							secondNumber)),
					Math.round(result), 1);

		}
	}

	/***
	 * 
	 * 
	 * IMPLEMENTATION OF THE TEST METHODS FOR SUBTRACTION
	 * 
	 * 
	 * 
	 */

	@Test
	public void testSubtractSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.subtract(
							firstNumber, secondNumber)),
					Math.round(result), 1);

			// This log is the same but clearer than required for exercise
			// LOG.info("Testing the method subtract with: "
			// + firstNumber + " and " + secondNumber + "("+result+"), result
			// round: " + Math.round(result));
			// assertEquals(
			// Math.round(calculator.subtract(firstNumber,
			// secondNumber)),
			// Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.subtract(
							firstNumber, secondNumber)),
					Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 1000));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.subtract(
							firstNumber, secondNumber)),
					Math.round(result), 1);

		}
	}
	
	//---------------
	
	@Test
	public void testSubtractSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * (-10)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.subtract(
							firstNumber, secondNumber)),
					Math.round(result), 1);

			// This log is the same but clearer than required for exercise
			// LOG.info("Testing the method subtract with: "
			// + firstNumber + " and " + secondNumber + "("+result+"), result
			// round: " + Math.round(result));
			// assertEquals(
			// Math.round(calculator.subtract(firstNumber,
			// secondNumber)),
			// Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * (-100)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.subtract(
							firstNumber, secondNumber)),
					Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * (-1000)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.subtract(
							firstNumber, secondNumber)),
					Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractZeros() {

		// testing the case 0-0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber - secondNumber;

		LOG.info("Testing the method subtract with: " + firstNumber
				+ " and " + secondNumber);
		assertEquals(
				Math.round(calculator.subtract(firstNumber,
						secondNumber)),
				Math.round(result), 1);

		for (int i = 0; i < 200; i++) {

			// Testing the case of zero - something random
			firstNumber = 0;
			secondNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.subtract(firstNumber,
							secondNumber)),
					Math.round(result), 1);

			// Testing the case of something random - zero
			firstNumber = Double.valueOf(
					df.format(random.nextDouble() * 10));
			secondNumber = 0;
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with: "
					+ firstNumber + " and " + secondNumber);
			assertEquals(
					Math.round(calculator.subtract(firstNumber,
							secondNumber)),
					Math.round(result), 1);

		}
	}
	
}
