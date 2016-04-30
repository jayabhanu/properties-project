/**
 *   File Name: RequestInputTests.java<br>
 *
 *   Gajula Jayabhanu<br>

 *   Created: Mar 30, 2016
 *
 */

package com.sqa.jf.util.helpers;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * RequestInputTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Gajula Jayabhanu
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestInputTests {

	static private String question;
	static private Scanner scanner;
	static private String userName;
	static private Object userValue;

	/**
	 *
	 */
	@AfterClass
	public static void farewellUser() {
		System.out.println("Thank you " + userName + " for executing my Request Input tests.\nHave a great day!");
		scanner.close();
	}

	/**
	 *
	 */
	@BeforeClass
	public static void welcomeUser() {
		System.out.println("Welcome to my Request Input Tests");
		System.out.print("Could you please provide me your name:");
		scanner = new Scanner(System.in);
		userName = scanner.nextLine();
	}

	/**
	 * @param question
	 * @param userValue
	 */
	@Before
	public void clearVariables() {
		userValue = "";
		question = "";
	}

	/**
	 * @param question
	 * @param userValue
	 */
	@After
	public void displayOutput() {
		System.out.println("For the question \"" + question + "\", you have given the value of (" + userValue + ")");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helpers.RequestInput#getChar(java.lang.String)}.
	 */
	@Test

	public void testGetCharString() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helpers.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test

	public void testGetCharStringCharArray() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helpers.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test

	public void testGetDouble() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helpers.RequestInput#getInt(java.lang.String, int[])}
	 * .
	 */
	@Test
	public void testGetInt() {
		question = "Please give me your lucky number:";
		userValue = RequestInput.getInt(question, 1, 2, 3, 4, 5, 6, 7);
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helpers.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	public void testGetString() {
		question = "Please give me your favorite color:";
		userValue = RequestInput.getString(question, "red", "white", "blue");
	}
}
