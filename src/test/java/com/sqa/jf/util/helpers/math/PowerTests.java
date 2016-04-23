/**
 *   File Name: MyMathTests.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.jf.util.helpers.math;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sqa.jf.util.helpers.MyMath;

/**
 * MyMathTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 *
 */
// @RunWith(value = Parameterized.class)
public class PowerTests {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { 2.0, 2.0, 4.0 }, { 5.0, 2.0, 25.0 }, { 4.0, 3.0, 64.0 }, { 1.0, 0.0, 1.0 },
				{ 3.0, 1.0, 3.0 }, { 2.0, 1.5, 3.25 } };
		return data;
	}

	private double expectedResult;
	private double num;
	private double power;

	public PowerTests(double num, double power, double expectedResult) {
		super();
		this.num = num;
		this.power = power;
		this.expectedResult = expectedResult;
	}

	@Test
	public void testPowerNumbers() {
		double actualResult;
		double expectedResult = this.expectedResult;
		double num = this.num;
		double power = this.power;
		actualResult = MyMath.powerNumber(num, power);
		String message = String.format("The result of %.0f to the power of %.0f is %.0f", num, power, actualResult);
		System.out.println(message);
		// Assert.assertEquals(message, expectedResult, actualResult, 0);
	}
}
