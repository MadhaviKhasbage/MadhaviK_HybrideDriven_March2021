package com.technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.technocredits.orghrm.base.PredefinedActions;

public class LoginPage extends PredefinedActions {

	public boolean isLogoDisplayed() {
		return driver.findElement(By.id("divLogo")).isDisplayed();
	}

	public HomePage doLogin(String username, String password) {		
		enterUserName(username);
		enterPassword(password);
		clickOnLoginButton();
		return new HomePage();
	}
	
	public LoginPage enterUserName(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		return this;
	}
	
	public void clickOnLoginButton() {
		driver.findElement(By.id("btnLogin")).click();
	}
}
