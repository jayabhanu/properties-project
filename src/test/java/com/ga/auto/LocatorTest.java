/**
 *   File Name: BasicAutoTest.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 20, 2016
 *
 */

package com.ga.auto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sqa.jf.util.helpers.Locator;

/**
 * BasicAutoTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class LocatorTest {

	static WebDriver driver;

	@BeforeClass
	public void setupFirefox() throws InterruptedException {
		driver = new FirefoxDriver();

	}

	@Test(priority = 0)
	public void test() throws InterruptedException {
		String pageTitle = "MSN.com - Hotmail, Outlook, Skype, Bing, Latest News, Photos & Videos";

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://msn.com");
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), pageTitle, "page loaded does not seem successful");
	}

	@Test(priority = -1)
	public void test1() {
		List<WebElement> links = Locator.getByTagName(driver, "tagname");
		int i = 1;
		for (WebElement link : links) {
			String text = link.getText();
			if (text.equals("")) {
				text = "Non-text Element (" + i + ")";
				i++;
			}
			System.out.println(link.getText() + link.getAttribute("href"));
		}
	}
}
