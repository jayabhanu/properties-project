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

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
public class BasicAutoTest {
	@DataProvider
	public static Object[][] getData() {
		Object[][] data = { { "jayabhanubec@gmail.com", "Hanuman05gajula" }, { "gk.rajesh3@gmail.com", "Rajeshjcl" },
				{ "sqasolution2015@gmail.com", "sqaadmin2015" }, };
		return data;
	}

	WebDriver driver;

	@BeforeClass(enabled = true, groups = "firefox")
	public void setupChrome() throws InterruptedException {
		// file = new
		// File("C:\Users\bhanu\Downloads\chromedriver_win32.zip/chromedriver.exe")
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.get("http://gmail.com");
		Thread.sleep(1000);
	}

	@BeforeClass(enabled = false, groups = "firefox")
	public void setupFirefox() throws InterruptedException {
		this.driver = new FirefoxDriver();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.get("http://gmail.com");
		Thread.sleep(1000);
	}

	@Test(dataProvider = "getData")
	public void test(String username, String password) throws InterruptedException {
		System.out.println("Basic test: U..." + username + "P..." + password);

		// this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// this.driver.get("http://www.gmail.com");
		// this.driver.manage().window().maximize();
		// Thread.sleep(1000);
		// driver.findElement(By.id("Email")).sendKeys(username);
		// driver.findElement(By.id("Email")).sendKeys(" YOUR USER NAME");
	}
}
