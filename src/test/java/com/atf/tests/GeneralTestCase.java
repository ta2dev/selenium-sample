package com.atf.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.atf.pagefac.LoginFactory;

public class GeneralTestCase {

	@Test
	public void test_app() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		try {
			LoginFactory login = new LoginFactory(driver);

			login.verify_forgot_passwordLink();
			login.login_into_application("admin", "admin123");

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}
