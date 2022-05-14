package com.atf.pagefac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.atf.Utils;
import com.atf.pages.LoginPage;

public class LoginFactory {

	
	WebDriver driver;
	Utils util;
	LoginPage login;

	public LoginFactory(WebDriver driver) {
		this.driver = driver;
		util = new Utils(driver);
		login = PageFactory.initElements(driver, LoginPage.class);
	}
	
	public void login_into_application(String uname, String pwd) {

		// Enter username and password
		util.enter_keys(login.username, uname);
		util.enter_keys(login.passwd, pwd);

		// Click on Login Button
		util.click_element(login.loginBtn);
	}

	public void verify_forgot_passwordLink() {

		// Verify forgot password link is visible
		util.wait_for_visibility(login.forgotPasswdLink);
	}

	
	
}
