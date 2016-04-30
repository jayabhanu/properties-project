package com.sqa.jf.util.helpers;

import org.junit.Test;

/**
 *   File Name: AppBasics.java<br>
 *
 *   Gajula Jayabhanu<br>

 *   Created: Apr 2, 2016
 *
 */

/**
 * AppBasics //ADDD (description of class)
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
public class AppBasicsTests {
	static String appName = "JF Test";
	static String userName;

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helpers.AppBasics#farewellUser(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testFarewellUser() {
		AppBasics.farewellUser(userName, appName);
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helpers.AppBasics#welcomeUserAndGetUsersName(java.lang.String)}
	 * .
	 */
	@Test
	public void testWelcomeUser() {
		userName = AppBasics.welcomeUserAndGetUsersName(appName);
	}

}
