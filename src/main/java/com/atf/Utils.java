package com.atf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	WebDriver driver;
	WebDriverWait wait;

	public Utils(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofMillis(30000));
	}

	public void click_element(WebElement element) {
		wait_for_visibility(element).click();
	}

	public void enter_keys(WebElement e, String keys) {
		wait_for_visibility(e).sendKeys(keys);
	}

	public WebElement wait_for_visibility(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public WebElement wait_for_visibility(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

}
