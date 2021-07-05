package com.technocredits.orghrm.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.technocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.HomePage;
import com.technocredits.orghrm.pages.LoginPage;

public class LoginTest {

	@Test
	public void loginTest() {

		PredefinedActions.start();
		LoginPage loginpage = new LoginPage();
		Assert.assertTrue(loginpage.isLogoDisplayed());

		HomePage homepage = loginpage.doLogin("Admin", "X@8yaTRn8R");
		Assert.assertEquals(homepage.isWelcomeMessageDisplayed(), "Welcome message not displayed");

		boolean isDashboardSelecedByDefault = homepage.isDashboardSelectedAsDefaultMenu();
		Assert.assertTrue(isDashboardSelecedByDefault, "Dashboard was not selected as default menu");

		List<String> menuTextList = homepage.getVisibleMenuList();
		Assert.assertEquals(11, menuTextList.size(), "Some menu is missing");

	}

}
