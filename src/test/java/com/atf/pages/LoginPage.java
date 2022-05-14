package com.atf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atf.Utils;

public class LoginPage {



	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement passwd;

	@FindBy(id = "btnLogin")
	public WebElement loginBtn;

	@FindBy(id = "forgotPasswordLink")
	public WebElement forgotPasswdLink;

	
}
